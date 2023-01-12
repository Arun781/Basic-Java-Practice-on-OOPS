package com.xworkz.springNew.bean;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String nameOfEngine;
	private String typeOfEngine;
	private String companyName;
	private String strokes;
	private float version;
	private Double number;

	public Engine(String nameOfEngine, String typeOfEngine, String companyName) {
		super();
		this.nameOfEngine = nameOfEngine;
		this.typeOfEngine = typeOfEngine;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Engine [name=" + nameOfEngine + ", typeOfEngine=" + typeOfEngine + ", companyName=" + companyName + ", strokes=" + strokes
				+ ", version=" + version + ", number=" + number + "]";
	}

}
