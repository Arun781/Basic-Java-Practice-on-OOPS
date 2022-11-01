package com.xworkz.association.one2many;

public class Company {
	public String name;
	public String ownerName;
	public Address address;
	
	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	public void setaddres(Address address) {
		this.address = address;
	}
	
	public void ShowOff() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		
		if (address != null) 
		{
			address.ShowOff();
		}
	}

}
