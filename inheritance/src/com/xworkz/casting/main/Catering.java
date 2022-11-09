package com.xworkz.casting.main;

public class Catering {
	public String cateringName;
	public String cateringOwner;
	public String cateringLocation;

	public Catering() {

	}

	public Catering(String cateringName, String cateringOwner, String cateringLocation) {
		super(); // by default super is first to be executed
		this.cateringName = cateringName;
		this.cateringOwner = cateringOwner;
		this.cateringLocation = cateringLocation;
		System.out.println("displaying  parameterized constructor of Catering class");
	}

}
