package com.xworkz.deepavali.shirt;

import com.xworkz.deepavali.constant.shirtEnum;

public class shirtBrand {
	public final String brand="ALLEN_SOLLY";
	public static String name;
	public String quality ;
	public double price;
	public double quantity;
	public shirtEnum ref = shirtEnum.ADIDAS;
	
	
	static{
		shirtBrand.name="new";
	}
	public shirtBrand(String quality, double price,double quantity,shirtEnum ref) {
		this.quality = quality;
		this.price = price;
		this.quantity=quantity;
		this.ref=ref;
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
		System.out.println(shirtEnum.ALLEN_SOLLY);
	}

}


