package com.uranus.dto;

import java.time.LocalDate;
import java.util.List;

public class ElementDto {

	public Integer id;
	public int type;
	public String title;
	public boolean isChecked;
	public boolean isRoot;
	public LocalDate createDate;
	public LocalDate updateDate;
	
	public List<ElementDto> children;
}
