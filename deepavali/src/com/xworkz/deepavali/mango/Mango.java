package com.xworkz.deepavali.mango;

import com.xworkz.deepavali.constant.MangoNames;

public class Mango {
    public final String color="yellow";
    public static boolean quality;
    public double quantity;
    public double price;
    public MangoNames names=MangoNames.RATNAGIRI;
    
    public Mango(double quantity) {
  	  this.quantity=quantity;
    }
    
    public void setPrice(double price) {
  	  this.price=price;
    }
    static {
  	  Mango.quality=true;
    }
    
    public void displayDetails() {
  	  System.out.println(color);
  	  System.out.println(quality);
  	  System.out.println(MangoNames.RATNAGIRI);
  	  System.out.println(this.price);
  	  System.out.println(this.quantity);
    }
    
    public void totalPrice() {
  	  double total=this.price*this.quantity;
  	  System.out.println(total);
      }

}
