package com.uranus.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.Execute;

import com.uranus.dto.ElementDto;
import com.uranus.service.IndexService;
import com.uranus.util.Type;

public class IndexAction {

	/**
	 * Contents mode
	 * 0: Memo
	 * 1: Task
	 */
	public String mode;

	/**
	 * Contents
	 */
	public List<ElementDto> list;

	/**
	 * Input text
	 */
	public String inputText;

	/**
	 * Add text
	 */
	public String addText;

	/**
	 * Edit text
	 */
	public String editText;

	/**
	 * For displaying child element recursively
	 */
	public List<ElementDto> child;

	/**
	 * For keeping adding/editing/removing element's id
	 */
	public String targetId;

	/**
	 * For displaying date without duplicate one
	 */
	public String date;

	/**
	 * Log4j logger
	 */
	public Logger logger = Logger.getLogger(IndexAction.class);

	@Resource
	protected IndexService indexService;

	@Execute(validator = false)
	public String index() {
		mode = Type.MEMO.getTypeAsString();
		return showMainPage();
	}

	@Execute(validator = false)
	public String memo() {
		return index();
	}

	@Execute(validator = false)
	public String task() {
		mode = Type.TASK.getTypeAsString();
		return showMainPage();
	}

	@Execute(validator = false)
	public String create() {
		ElementDto dto = indexService.assembleElementDto(inputText, mode);
		indexService.createElement(dto);
		return showMainPage();
	}

	@Execute(validator = false)
	public String add() {
		ElementDto dto = indexService.assembleElementDto(addText, mode);
		indexService.addElement(Integer.parseInt(targetId), dto);
		return showMainPage();
	}

	@Execute(validator = false)
	public String update() {
		indexService.updateElementText(Integer.parseInt(targetId), editText);
		return showMainPage();
	}

	@Execute(validator = false)
	public String remove() {
		indexService.removeElement(Integer.parseInt(targetId));
		return showMainPage();
	}

	@Execute(validator = false)
	public String toggleCheck() {
		indexService.toggleElementCheck(Integer.parseInt(targetId));
		return task();
	}

	@Execute(validator = false)
	public String up() {
		indexService.exchangeElements(Integer.parseInt(targetId));
		return showMainPage();
	}

	@Execute(validator = false)
	public String clear() {
		indexService.clear(Integer.parseInt(mode));
		return showMainPage();
	}

	private String showMainPage() {
		list = indexService.getList(Integer.parseInt(mode));
		return "index.jsp";
	}
}
