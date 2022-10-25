package com.xworkz.deepavali.sweet;

import com.xworkz.deepavali.constant.SweetStall;

public class Sweets {
	public static final String BRAND = "ShadhiWish";
	public static String name;
	public String ownerName;
	public SweetStall location = SweetStall.Hyderbad;
	public double price;
	public double quantity;

	public Sweets(String ownerName, SweetStall location, double price,double quantity) {
		this.ownerName = ownerName;
		this.location = location;
		this.price = price;
		this.quantity=quantity;
	}

	static {
		name = "Luxury Methai";
	}
	public void setPrice(double price) {
		this.price=price;
		
	}

	public void setTotalPrice() {
		double total =price*quantity;
		System.out.println("Total Price"+total);
	}

	public void ShowOff() {
		System.out.println(Sweets.BRAND);
		System.out.println(Sweets.name);
		System.out.println(this.ownerName);
		System.out.println(SweetStall.Bangalore);
		System.out.println(this.price);
		
	}

}
