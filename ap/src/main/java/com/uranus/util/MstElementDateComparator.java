package com.uranus.util;

import java.util.Comparator;

import com.uranus.dto.ElementDto;

public class MstElementDateComparator implements Comparator<ElementDto> {
	@Override
	public int compare(ElementDto e1, ElementDto e2) {
		return e2.updateDate.compareTo(e1.updateDate);
	}
}
