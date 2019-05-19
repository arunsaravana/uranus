package com.uranus.util;

import java.util.Comparator;

import com.uranus.dto.ElementDto;

public class MstElementIdComparator implements Comparator<ElementDto> {
	@Override
	public int compare(ElementDto e1, ElementDto e2) {
		return e1.id - e2.id;
	}
}
