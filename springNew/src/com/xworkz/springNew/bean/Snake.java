package com.xworkz.springNew.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String nameOfSanke;
	@Autowired
	private String colur;
	@Autowired
	private float length;
	private String type;
	private boolean poisionous;

	public Snake(String nameOfSanke, String type, boolean poisionous) {
		super();
		this.nameOfSanke = nameOfSanke;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + nameOfSanke + ", colur=" + colur + ", length=" + length + ", type=" + type + ", poisionous="
				+ poisionous + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
