package com.uranus.service;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;

import com.uranus.dto.ElementDto;

@RunWith(Seasar2.class)
public class IndexServiceTest {

	private IndexService indexService;

	public void assembleElementDtoTest() {
		ElementDto expected = new ElementDto();
		expected.type = 0;
		expected.title = "expected";
		ElementDto actual = indexService.assembleElementDto("expected", "0");
		assertEquals(expected.title, actual.title);
		assertEquals(expected.type, actual.type);
	}

	@Ignore
	public void getListTest() {

	}

	@Ignore
	public void createElementTest() {

	}

	@Ignore
	public void addElementTest() {

	}

	@Ignore
	public void updateElementTextTest() {

	}

	@Ignore
	public void removeElementTest() {

	}

	@Ignore
	public void toggleElementCheckTest() {

	}

	@Ignore
	public void exchangeElementsTest() {

	}

	@Ignore
	public void clearTest() {

	}

	@Ignore
	public void getAncestorIdTest() {

	}

	@Ignore
	public void rearrangeAncestorRelationTest() {

	}

	@Ignore
	public void rearrangeParentRelationTest() {

	}

	@Ignore
	public void rearrangeChildRelationTest() {

	}

	@Ignore
	public void getRelationByParentIdTest() {

	}

	@Ignore
	public void toggleIsRootPropertyTest() {

	}

	@Ignore
	public void createRelationsTest() {

	}

	@Ignore
	public void removeRelationsTest() {

	}

	@Ignore
	public void createElementMapTest() {

	}

	@Ignore
	public void createSortedListTest() {

	}

	@Ignore
	public void getRootElementTest() {

	}

	@Ignore
	public void getRootRelationTest() {

	}

	@Ignore
	public void removeDownwardContentsTest() {

	}

	@Ignore
	public void updateElementTest() {

	}

	@Ignore
	public void deleteElementTest() {

	}

	@Ignore
	public void deleteRelationTest() {

	}

	@Ignore
	public void getAllRelationTest() {

	}

	@Ignore
	public void insertElementTest() {

	}

	@Ignore
	public void insertRelationTest() {

	}

	@Ignore
	public void getElementDtoByIdTest() {

	}

	@Ignore
	public void getElementEntityByIdTest() {

	}

	@Ignore
	public void getUpwardRelationTest() {

	}

	@Ignore
	public void setChildrenTest() {

	}

	@Ignore
	public void setChildrenRecursivelyTest() {

	}

	@Ignore
	public void getRootELementsIdTest() {

	}

	@Ignore
	public void getRootElementsTest() {

	}

	@Ignore
	public void getParentTest() {

	}

}
