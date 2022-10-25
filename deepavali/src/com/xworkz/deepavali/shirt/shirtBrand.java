package com.xworkz.deepavali.shirt;

import com.xworkz.deepavali.constant.shirtEnum;

public class shirtBrand {
	public final String brand = "ALLEN_SOLLY";
	public static String name;
	public String quality ;
	public double price;
	public double quantity;
	
	
	static{
		shirtBrand.name="new";
	}
	public shirtBrand(String quality, double price,double quantity) {
		this.quality = quality;
		this.price = price;
		this.quantity=quantity;
	}
		public void setPrice(double price) {
		 this.price=price;
	}

	public void setTotalPrice() {
		double total =price*quantity;
		System.out.println("Total Price"+total);
	}

	public void ShowOff() {
		System.out.println(shirtBrand.name);
		System.out.println(this.quality);
		System.out.println(this.quantity);
		System.out.println(this.brand);
		System.out.println(this.price);		
	}

}


