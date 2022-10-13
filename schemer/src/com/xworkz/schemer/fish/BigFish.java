package com.xworkz.schemer.fish;

public class BigFish 
{
      public String name;
      public String type;
      public int price;
      public double weight;
      public float length;
      
      public BigFish(String name,String type)
      {
    	  this.name=name;
    	  System.out.println("");
    	  this.type=type;
    	  System.out.println("");
      }
     /* public BigFish(String type)
      {
    	  this.type=type;
    	  System.out.println("");
      }*/
      public BigFish(int price)
      {
    	  this.price=price;
    	  System.out.println("");
      }
      public BigFish(double weight)
      {
    	  this.weight=weight;
    	  System.out.println("");
      }
      public BigFish(float length)
      {
    	  this.length=length;
    	  System.out.println("");
      }
	public BigFish() {
		System.out.println("");
	}
}
