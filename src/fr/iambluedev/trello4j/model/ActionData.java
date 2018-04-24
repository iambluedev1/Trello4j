package fr.iambluedev.trello4j.model;

import java.util.Map;

public class ActionData {

	private String idMember;
	private Map<String, Object> board;
	private Map<String, Object> card;
	private Map<String, Object> list;
	private Map<String, Object> old;
	private Map<String, Object> checkItem;
	private Map<String, Object> checklist;
	
	public ActionData(String idMember, Map<String, Object> board, Map<String, Object> card, Map<String, Object> list,
			Map<String, Object> old, Map<String, Object> checkItem, Map<String, Object> checklist) {
		this.idMember = idMember;
		this.board = board;
		this.card = card;
		this.list = list;
		this.old = old;
		this.checkItem = checkItem;
		this.checklist = checklist;
	}

	public String getIdMember() {
		return idMember;
	}

	public Map<String, Object> getBoard() {
		return board;
	}

	public Map<String, Object> getCard() {
		return card;
	}

	public Map<String, Object> getList() {
		return list;
	}

	public Map<String, Object> getOld() {
		return old;
	}

	public Map<String, Object> getCheckItem() {
		return checkItem;
	}

	public Map<String, Object> getCheckList() {
		return checklist;
	}
}
