package com.xworkz.deepavali.saloon;

import com.xworkz.deepavali.constant.SaloonShopNames;

public class Saloon {
	public final String type = "ladies";
	public SaloonShopNames names = SaloonShopNames.LOREAL;;
	public String shopAddress;
	public static boolean reviews;
	public int streetNo;

	public Saloon(int streetNo) {
		this.streetNo = streetNo;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	static {
		Saloon.reviews = true;
	}

	public void displayDetails() {
    	System.out.println(this.streetNo);
    	System.out.println(this.shopAddress);
    	System.out.println(reviews);
    	System.out.println(type);
    	System.out.println(names);
    }
}
