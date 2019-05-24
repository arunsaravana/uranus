package com.uranus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.uranus.dbflute.allcommon.DBMetaInstanceHandler;
import com.uranus.dbflute.exentity.*;

/**
 * The entity of mst_relation as TABLE. <br>
 * <pre>
 * [primary-key]
 *     parent_id, child_id
 *
 * [column]
 *     parent_id, child_id
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer parentId = entity.getParentId();
 * Integer childId = entity.getChildId();
 * entity.setParentId(parentId);
 * entity.setChildId(childId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMstRelation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** parent_id: {PK, NotNull, int4(10)} */
    protected Integer _parentId;

    /** child_id: {PK, NotNull, int4(10)} */
    protected Integer _childId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "mst_relation";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_parentId == null) { return false; }
        if (_childId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMstRelation) {
            BsMstRelation other = (BsMstRelation)obj;
            if (!xSV(_parentId, other._parentId)) { return false; }
            if (!xSV(_childId, other._childId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _parentId);
        hs = xCH(hs, _childId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_parentId));
        sb.append(dm).append(xfND(_childId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public MstRelation clone() {
        return (MstRelation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] parent_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'parent_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParentId() {
        checkSpecifiedProperty("parentId");
        return _parentId;
    }

    /**
     * [set] parent_id: {PK, NotNull, int4(10)} <br>
     * @param parentId The value of the column 'parent_id'. (basically NotNull if update: for the constraint)
     */
    public void setParentId(Integer parentId) {
        registerModifiedProperty("parentId");
        _parentId = parentId;
    }

    /**
     * [get] child_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'child_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getChildId() {
        checkSpecifiedProperty("childId");
        return _childId;
    }

    /**
     * [set] child_id: {PK, NotNull, int4(10)} <br>
     * @param childId The value of the column 'child_id'. (basically NotNull if update: for the constraint)
     */
    public void setChildId(Integer childId) {
        registerModifiedProperty("childId");
        _childId = childId;
    }
}
