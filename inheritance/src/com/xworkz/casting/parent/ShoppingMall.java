package com.xworkz.casting.parent;

public class ShoppingMall {
	public String location;
	public int noOfFloars;
	public int noOfMall;

	public ShoppingMall() {
		System.out.println("Created default constructor of ShoppingMall class");
	}

	public ShoppingMall(String location, int noOfFloars, int noOfMall) {
		super();
		this.location = location;
		this.noOfFloars = noOfFloars;
		this.noOfMall = noOfMall;
	}

	public void ShowOff() {
		System.out.println(location);
		System.out.println(noOfFloars);
		System.out.println(noOfMall);
	}
}
