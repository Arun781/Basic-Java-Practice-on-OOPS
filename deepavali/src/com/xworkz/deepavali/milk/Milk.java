package com.xworkz.deepavali.constant.milk;

import com.xworkz.deepavali.constant.MilkBrands;

public class Milk {
	   public MilkBrands brand=MilkBrands.AMUL;
	   public static boolean quality=true;
	   public int price;
	   public int quantity;
	   public final String shopName="Bengaluru milk union limited";
	   
	   public Milk(int quantity) {
		   this.quantity=quantity;
	   }
	   
	   public void setPrice(int price) {
		   this.price=price;
	   }
	   
	   static {
		   Milk.quality=true;
	   }
	   
	   public void displayDetails() {
		   System.out.println(shopName);
		   System.out.println(brand);
		   System.out.println(quality);
		   System.out.println(this.price);
		   System.out.println(this.quantity);
	   }
	   
	   public void totalPrice() {
		   int total=this.price*this.quantity;
		   System.out.println(total);
	   }

}
