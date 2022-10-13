package com.xworkz.schemer.bread;

public class Bread
{
  public int price;
  public String shape;
  public double quantity;
  public String companyName;
  public char type;
  
  public Bread(String shape,String companyName)
  {
	  this.companyName=companyName;
	  this.shape=shape;
  }
  public Bread(int price, double quantity, char type)
  {
	  this.price=price;
	  this.quantity=quantity;
	  this.type=type;
  }
}
