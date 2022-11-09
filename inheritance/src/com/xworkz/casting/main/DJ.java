package com.xworkz.casting.main;

public class DJ {
	public String djName;
	public String noOfDjs;
	public long price;

	public DJ() {
		System.out.println("Created default constructor of DJ class");
	}

	public DJ(String djName, String noOfDjs, long price) {
		super(); // by default
		this.djName = djName;
		this.noOfDjs = noOfDjs;
		this.price = price;
		System.out.println("Created parameterised constuctor of DJ class");
	}

}
