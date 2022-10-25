package com.xworkz.deepavali.lamp;

import com.xworkz.deepavali.constant.LampBrands;

public class Lamp {
    public final String type="Study lamp";
    public double price;
    public double weight;
    public static char size;
    public LampBrands lamp=LampBrands.MARSET;
    
    public Lamp(double price) {
    	this.price=price;
    }
    
    public void setWeight(double weight) {
    	this.weight=weight;
    }
    
    static {
    	Lamp.size='M';
    }
    public void displayDetails() {
    	System.out.println(this.price);
    	System.out.println(this.weight);
    	System.out.println(size);
    	System.out.println(type);
    	System.out.println(LampBrands.MARSET);
    }


}
