package com.uranus.util;

public enum Type {
	MEMO(0),
	TASK(1);

	private final int type;
	
	private Type(int type) {
		this.type = type;
	}
	
	public int getType() {
		return this.type;
	}
	
	public String getTypeAsString() {
		return String.valueOf(this.type);
	}
}
