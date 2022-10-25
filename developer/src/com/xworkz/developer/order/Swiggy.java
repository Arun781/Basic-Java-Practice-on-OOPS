package com.xworkz.developer.order;

import com.xworkz.developer.constant.HotelName;

public class Swiggy {
	public String email;
	public long num;
	public double otp;
	public HotelName hotelName = HotelName.Hotel_1;
	
	public Swiggy(String email, long num, double otp, HotelName hotelName) {
		super();
		this.email = email;
		this.num = num;
		this.otp = otp;
		this.hotelName = hotelName;
	}
	public void ShowOff() {
		System.out.println(this.email);
		System.out.println(this.num);
		System.out.println(this.otp);
		System.out.println(this.hotelName.values());

	}

}
