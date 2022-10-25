package com.xworkz.developer.constant;

public enum HotelName {
	Hotel_1("Udupi",9620753670l),Hotel_2("Kamath",8884557503l);
	
	public String name;
	public long phone;
	
	private HotelName(String name,long phone ) {
		this.name=name;
		this.phone=phone;
	}
	

}
