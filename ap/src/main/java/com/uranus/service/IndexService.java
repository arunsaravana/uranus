package com.uranus.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.optional.OptionalEntity;

import com.uranus.dbflute.exbhv.MstElementBhv;
import com.uranus.dbflute.exbhv.MstRelationBhv;
import com.uranus.dbflute.exentity.MstElement;
import com.uranus.dbflute.exentity.MstRelation;
import com.uranus.dto.ElementDto;
import com.uranus.dxo.ElementDxo;
import com.uranus.util.MstElementDateComparator;
import com.uranus.util.MstElementIdComparator;
import com.uranus.util.StringUtil;
import com.uranus.util.Type;

public class IndexService {

	@Resource
	protected MstElementBhv mstElementBhv;

	@Resource
	protected MstRelationBhv mstRelationBhv;

	/**
	 * Parent ElementDto
	 */
	private static ElementDto parent;

	/**
	 * Log4j logger
	 */
	public Logger logger = Logger.getLogger(IndexService.class);

	// -------------------------- public methods --------------------------

	/**
	 * Setup ElementDto and return it.
	 * @param  text title
	 * @return      assembled ElementDto
	 */
	public ElementDto assembleElementDto(String text, String mode) {
		ElementDto dto = new ElementDto();
		dto.type = Integer.parseInt(mode);
		dto.title = StringUtil.sanitize(text);
		LocalDate now = LocalDate.now();
		dto.createDate = now;
		dto.updateDate = now;
		return dto;
	}

	/**
	 * Get root elements and their children (recursively) from database.
	 * @param  type element type
	 * @return      contents list if exists, otherwise {@code null}
	 */
	public List<ElementDto> getList(int type) {
		List<Integer> rootIdList = getRootElementsId(type);
		if (rootIdList.size() == 0) return null;
		Map<Integer, ElementDto> elmMap = createElementMap(rootIdList);
		ListResultBean<MstRelation> rootRels = getRootRelation(rootIdList);
		rootRels.forEach(rel -> {
			ElementDto parentDto = getParent(elmMap.get(rel.getParentId()));
			setChildren(parentDto, rel.getChildId());
		});
		return createSortedList(elmMap, type);
	}

	/**
	 * Create new element.
	 * @param dto target ElementDto
	 */
	public void createElement(ElementDto dto) {
		insertElement(dto, true);
	}

	/**
	 * Add element.
	 * @param parentId parent element id
	 * @param childDto child ElementDto
	 */
	public void addElement(int parentId, ElementDto childDto) {
		MstElement element = insertElement(childDto, false);
		insertRelation(parentId, element.getId());
	}

	/**
	 * Update element.
	 * @param targetId target element id
	 * @param text     element text
	 */
	public void updateElementText(int targetId, String text) {
		ElementDto dto = getElementDtoById(targetId);
		dto.title = text;
		dto.updateDate = LocalDate.now();
		MstElement element = ElementDxo.toElementEntity(dto);
		updateElement(element);
	}

	/**
	 * Remove element and its relation (recursively) from database.
	 * @param id target element id
	 */
	public void removeElement(int id) {
		MstElement element = getElementEntityById(id);
		if (element == null) return;
		MstRelation upwardRel = getUpwardRelation(element.getId());
		if (upwardRel != null) deleteRelation(upwardRel);
		removeDownwardContents(element.getId());
	}

	/**
	 * Toggle element's isChecked property.
	 * @param id target element id
	 */
	public void toggleElementCheck(int id) {
		MstElement element = getElementEntityById(id);
		if (element == null) return;
		boolean checked = element.getIsChecked();
		element.setIsChecked(!checked);
		updateElement(element);
	}

	/**
	 * Exchange elements relation.
	 * @param childId target element id to be promoted
	 */
	public void exchangeElements(int childId) {
		if (getElementDtoById(childId).isRoot) return;
		int parentId = getUpwardRelation(childId).getParentId();
		Integer ancestorId = getAncestorId(parentId);
		rearrangeAncestorRelation(ancestorId, parentId, childId);
		ListResultBean<MstRelation> childRels = getRelationByParentId(childId);
		ListResultBean<MstRelation> parentRels = getRelationByParentId(parentId);
		rearrangeChildRelation(parentId, childId, childRels);
		rearrangeParentRelation(parentId, childId, parentRels);
		toggleIsRootProperty(childId, parentId);
	}

	/**
	 * Delete all elements and relations with type.
	 * @param type contents type
	 */
	public void clear(int type) {
		List<Integer> rootElmsIdList = getRootElementsId(type);
		rootElmsIdList.forEach(rootElm -> {
			removeDownwardContents(rootElm);
		});
	}

	// -------------------------- private methods --------------------------

	/**
	 * Get ancestor element id.
	 * @param  parentId parent element id
	 * @return          ancestor element id if exists, otherwise {@code null}
	 */
	private Integer getAncestorId(int parentId) {
		MstRelation rel = getUpwardRelation(parentId);
		if (rel != null) return rel.getParentId();
		return null;
	}

	/**
	 * Rearrange relation between ancestor element, parent element, and target
	 * element.
	 * @param ancestorId ancestor element id
	 * @param parentId   parent element id
	 * @param targetId   target element id to be promoted
	 */
	private void rearrangeAncestorRelation(Integer ancestorId, int parentId, int targetId) {
		if (ancestorId != null) {
			deleteRelation(ancestorId, parentId);
			insertRelation(ancestorId, targetId);
		}
	}

	/**
	 * Rearrange relation between parent element and target element.
	 * @param parentId   parent element id
	 * @param targetId   target element id to be promoted
	 * @param parentRels parent element's downward relation
	 */
	private void rearrangeParentRelation(int parentId, int targetId, ListResultBean<MstRelation> parentRels) {
		removeRelations(parentId, parentRels);
		createRelations(targetId, parentRels);
		insertRelation(targetId, parentId);
	}

	/**
	 * Rearrange target element downward relation.
	 * @param parentId  parent element id
	 * @param targetId  target element id to be promoted
	 * @param childRels target element's downward relation
	 */
	private void rearrangeChildRelation(int parentId, int targetId, ListResultBean<MstRelation> childRels) {
		if (childRels.size() > 0) {
			removeRelations(targetId, childRels);
			createRelations(parentId, childRels);
		}
	}

	/**
	 * Get downward relation by parent id.
	 * @param  parentId parent element id
	 * @return          relation list
	 */
	private ListResultBean<MstRelation> getRelationByParentId(int parentId) {
		ListResultBean<MstRelation> rels = mstRelationBhv.selectList(cb -> {
			cb.query().setParentId_Equal(parentId);
		});
		return rels;
	}

	/**
	 * Toggle element is_root property.
	 * @param newParentId element id to be promoted
	 * @param oldParentId element id to be demoted
	 */
	private void toggleIsRootProperty(int newParentId, int oldParentId) {
		MstElement oldParent = getElementEntityById(oldParentId);
		if (oldParent.getIsRoot()) {
			oldParent.setIsRoot(false);
			updateElement(oldParent);
			MstElement newParent = getElementEntityById(newParentId);
			newParent.setIsRoot(true);
			updateElement(newParent);
		}
	}

	/**
	 * Create relation with parentId and relation list's childId.
	 * @param parentId parent element id
	 * @param rels     relation list
	 */
	private void createRelations(int parentId, ListResultBean<MstRelation> rels) {
		rels.forEach(rel -> {
			if (parentId != rel.getChildId()) {
				insertRelation(parentId, rel.getChildId());
			}
		});
	}

	/**
	 * Remove relation with parentId and relation list's childId.
	 * @param parentId
	 * @param rels
	 */
	private void removeRelations(int parentId, ListResultBean<MstRelation> rels) {
		rels.forEach(rel -> {
			deleteRelation(parentId, rel.getChildId());
		});
	}

	/**
	 * Create map from root elements id.
	 * @param  rootIdList root elements id
	 * @return            map key:element id, value:ElementDto
	 */
	private Map<Integer, ElementDto> createElementMap(List<Integer> rootIdList) {
		Map<Integer, ElementDto> elmMap = new HashMap<>();
		ListResultBean<MstElement> rootElms = getRootElement(rootIdList);
		rootElms.forEach(rootElm -> {
			elmMap.put(rootElm.getId(), ElementDxo.toElementDto(rootElm));
		});
		return elmMap;
	}

	/**
	 * Create list from map.
	 * @param  map  key:id, value:ElementDto
	 * @param  type contents type
	 * @return      ElementDto list
	 */
	private List<ElementDto> createSortedList(Map<Integer, ElementDto> map, int type) {
		List<ElementDto> list = new ArrayList<>(map.values());
		if (type == Type.MEMO.getType()) {
			list.sort(new MstElementIdComparator());
		} else {
			list.sort(new MstElementDateComparator());
		}
		return list;
	}

	/**
	 * Get root elements by root elements id.
	 * @param  rootIdList root elements id list
	 * @return            root elements list
	 */
	private ListResultBean<MstElement> getRootElement(List<Integer> rootIdList) {
		ListResultBean<MstElement> rootElms = mstElementBhv.selectList(cb -> {
			cb.query().setId_InScope(rootIdList);
			cb.query().addOrderBy_Id_Asc();
		});
		return rootElms;
	}

	/**
	 * Get root relation by root elements id.
	 * @param  rootIdList root elements id list
	 * @return            root relation list
	 */
	private ListResultBean<MstRelation> getRootRelation(List<Integer> rootIdList) {
		ListResultBean<MstRelation> rootRels = mstRelationBhv.selectList(cb -> {
			cb.query().setParentId_InScope(rootIdList);
			cb.query().addOrderBy_ParentId_Asc();
		});
		logger.info("    Root relation list: " + rootRels);
		return rootRels;
	}

	/**
	 * Delete downward relation and its element recursively from database.
	 * @param parentId parent element id
	 */
	private void removeDownwardContents(int parentId) {
		List<MstRelation> downwardRels = getAllRelation(parentId);
		downwardRels.forEach(rel -> {
			removeDownwardContents(rel.getChildId());
			deleteRelation(parentId, rel.getChildId());
		});
		MstElement elm = getElementEntityById(parentId);
		deleteElement(elm);
	}

	/**
	 * Update element.
	 * @param elm element entity
	 */
	private void updateElement(MstElement elm) {
		mstElementBhv.update(elm);
		logger.info("    Element updated: " + elm);
	}

	/**
	 * Delete element from database by element entity.
	 * @param  elm element entity
	 * @return     element entity after deletion.
	 */
	private MstElement deleteElement(MstElement elm) {
		mstElementBhv.delete(elm);
		logger.info("    Element deleted: " + elm);
		return elm;
	}

	/**
	 * Delete relation from database by parentId and childId.
	 * @param  parentId parent element id.
	 * @param  childId  child element id.
	 * @return          relation entity after deletion.
	 */
	private MstRelation deleteRelation(int parentId, int childId) {
		MstRelation rel = new MstRelation();
		rel.setParentId(parentId);
		rel.setChildId(childId);
		return deleteRelation(rel);
	}

	/**
	 * Delete relation from database by relation entity.
	 * @param  rel relation entity
	 * @return     relation entity after deletion.
	 */
	private MstRelation deleteRelation(MstRelation rel) {
		try {
			mstRelationBhv.delete(rel);
		} catch (EntityAlreadyDeletedException e) {}
		logger.info("    Relation deleted: " + rel);
		return rel;
	}

	/**
	 * Get all relation by id.
	 * @param  parentId parent element id
	 * @return          relation entity list
	 */
	private ListResultBean<MstRelation> getAllRelation(int parentId) {
		ListResultBean<MstRelation> rels = mstRelationBhv.selectList(cb -> {
			cb.query().setParentId_Equal(parentId);
			cb.query().addOrderBy_ChildId_Asc();
		});
		return rels;
	}

	/**
	 * Insert Element into database.
	 * @param  dto    target element DTO
	 * @param  isRoot whether argument DTO is root or not
	 * @return        element entity after insertion
	 */
	private MstElement insertElement(ElementDto dto, boolean isRoot) {
		MstElement element = ElementDxo.toElementEntity(dto);
		element.setId(null);
		element.setIsRoot(isRoot);
		mstElementBhv.insert(element);
		logger.info("    Element created: " + element);
		return element;
	}

	/**
	 * Insert Relation into database.
	 * @param  parentId parent element id
	 * @param  childId  child element id
	 * @return          relation entity after insertion.
	 */
	private MstRelation insertRelation(int parentId, int childId) {
		MstRelation relation = new MstRelation();
		relation.setParentId(parentId);
		relation.setChildId(childId);
		mstRelationBhv.insert(relation);
		logger.info("    Relation created: " + relation);
		return relation;
	}

	/**
	 * Get element from database by id.
	 * @param  id element id
	 * @return    ElementDto if entity exists, {@code null} otherwise
	 */
	private ElementDto getElementDtoById(int id) {
		OptionalEntity<MstElement> op = mstElementBhv.selectEntity(cb -> {
			cb.query().setId_Equal(id);
		});
		if (op.isPresent()) return ElementDxo.toElementDto(op.get());
		return null;
	}

	/**
	 * Get element from database by id.
	 * @param  id element id
	 * @return    element entity if it exists, otherwise {@code null}
	 */
	private MstElement getElementEntityById(int id) {
		OptionalEntity<MstElement> op = mstElementBhv.selectEntity(cb -> {
			cb.query().setId_Equal(id);
		});
		if (op.isPresent()) return op.get();
		return null;
	}

	/**
	 * Get relation from database by id.
	 * @param  childId child element id
	 * @return         relation entity if it exists, {@code null} otherwise
	 */
	private MstRelation getUpwardRelation(int childId) {
		OptionalEntity<MstRelation> op = mstRelationBhv.selectEntity(cb -> {
			cb.query().setChildId_Equal(childId);
		});
		if (op.isPresent()) return op.get();
		return null;
	}

	/**
	 * If parent has children, set it recursively by id.
	 * @param parentDto parent ElementDto
	 * @param childId   child element id
	 */
	private void setChildren(ElementDto parentDto, int childId) {
		if (parentDto == null) return;
		ElementDto childDto = getElementDtoById(childId);
		if (childDto == null) return;
		// If child also has children, set it recursively
		setChildrenRecursively(childDto, childId);
		parentDto.children.add(childDto);
	}

	/**
	 * Get relation with childId and call setChildren if they exist
	 * @param childDto child ElementDto
	 * @param childId  child element id
	 */
	private void setChildrenRecursively(ElementDto childDto, int childId) {
		ListResultBean<MstRelation> rels = mstRelationBhv.selectList(cb -> {
			cb.query().setParentId_Equal(childId);
			cb.query().addOrderBy_ChildId_Asc();
		});
		rels.forEach(rel -> {
			setChildren(childDto, rel.getChildId());
		});
	}

	/**
	 * Get root elements from database, and return their id.
	 * @param  mode contents mode
	 * @return      root elements id list
	 */
	private List<Integer> getRootElementsId(int type) {
		ListResultBean<MstElement> elms = getRootElements(type);
		List<Integer> idList = new ArrayList<>();
		elms.forEach(elm -> {
			idList.add(elm.getId());
		});
		logger.info("    Root id list: " + idList);
		return idList;
	}

	/**
	 * Get root elements with element type.
	 * @param  type element type
	 * @return      Element entity list
	 */
	private ListResultBean<MstElement> getRootElements(int type) {
		return mstElementBhv.selectList(cb -> {
			cb.query().setIsRoot_Equal(true);
			cb.query().setType_Equal(type);
			cb.query().addOrderBy_Id_Asc();
		});
	}

	/**
	 * Return the same ElementDto until argument DTO has different id.
	 * @param  dto ElementDto
	 * @return     parent if argument DTO has the same id as that of it,
	 *                 argument DTO otherwise.
	 */
	private ElementDto getParent(ElementDto dto) {
		if (parent != null && dto.id == parent.id.intValue()) return parent;
		parent = dto;
		return parent;
	}
}
