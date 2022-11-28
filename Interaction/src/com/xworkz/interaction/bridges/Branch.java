package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Banking;

public  class Branch implements Banking {
	public String name() {
		System.out.println("Name of Bank:-"+"Canara Bank");
		return null;
	}
	public String branch() {
		System.out.println("The branch of the bank is Vijayanagar");
		return null;	
	}
	public long idNumber() {
		System.out.println("The ID num of Bank is :-"+00552255);
		return 0;	
	}
	public long pinNo() {
		System.out.println("the pincode is"+583214);
		return 0;	
	}
	public String managerName() {
		System.out.println("The Manager Name is Shivu Veerapur");
		return null;
	}

}
