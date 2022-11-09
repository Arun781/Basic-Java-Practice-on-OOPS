package com.xworkz.casting.main;

import com.xworkz.enums.Card;

public class HomingCermony extends Invitations {
      public String name;
      public String date;
      public String location;
      public Card type;
	public HomingCermony(String name, String date, String location,Card type) {
		super();
		this.name = name;
		this.date = date;
		this.location=location;
		this.type=type;
	}
	public HomingCermony() {
		super();	
		System.out.println("Default HomingCermony constructor Created");
	}
	public HomingCermony(double price, int noOfCopies, Card type) {
		super(price, noOfCopies, type);
		
	}
	public void ShowOff() {
		System.out.println(name);
		System.out.println(date);
		System.err.println(location);
		System.out.println(type);
	}
}
