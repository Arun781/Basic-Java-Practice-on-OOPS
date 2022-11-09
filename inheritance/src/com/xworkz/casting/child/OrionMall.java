package com.xworkz.casting.child;

import com.xworkz.casting.parent.ShoppingMall;

public class OrionMall extends ShoppingMall {
	public String ownerName;

	public OrionMall() {
		super();

	}

	public OrionMall(String location, int noOfFloars, int noOfMall, String ownerName) {
		super(location, noOfMall, noOfMall);
		this.ownerName = ownerName;
	}

	public void ShowOff() {
		super.ShowOff();
		System.out.println(ownerName);
	}

}
