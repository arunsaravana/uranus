package com.uranus.dxo;

import java.util.ArrayList;

import com.uranus.dbflute.exentity.MstElement;
import com.uranus.dto.ElementDto;

public class ElementDxo {

	/**
	 * Convert MstElement to ElementDto
	 * @param element MstElement
	 * @return ElementDto
	 */
	public static ElementDto toElementDto(MstElement element) {
		ElementDto dto = new ElementDto();
		dto.id = element.getId();
		dto.type = element.getType();
		dto.title = element.getTitle();
		dto.isChecked = element.getIsChecked();
		dto.isRoot = element.getIsRoot();
		dto.createDate = element.getCreateDate();
		dto.updateDate = element.getUpdateDate();
		dto.children = new ArrayList<>();
		return dto;
	}
	
	/**
	 * Convert ElementDto to MstElement
	 * @param dto ElementDto
	 * @return MstElement
	 */
	public static MstElement toElementEntity(ElementDto dto) {
		MstElement entity = new MstElement();
		entity.setId(dto.id);
		entity.setType(dto.type);
		entity.setTitle(dto.title);
		entity.setIsChecked(dto.isChecked);
		entity.setIsRoot(dto.isRoot);
		entity.setCreateDate(dto.createDate);
		entity.setUpdateDate(dto.updateDate);
		return entity;
	}
}
