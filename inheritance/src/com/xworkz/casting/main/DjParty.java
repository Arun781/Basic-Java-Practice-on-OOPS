package com.xworkz.casting.main;

public class DjParty extends DJ {
	public DjParty() {
		System.out.println("Created default constructor of Djparty class");
	}

	public DjParty(String djName, String noOfDjs, long price) {
		super(djName, noOfDjs, price);

	}

}
