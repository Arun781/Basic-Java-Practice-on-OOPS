package com.xworkz.developer.connect;

import com.xworkz.developer.constant.HotelName;

public class Software {
	public static final String COMPANY;
	public static String project;
	public String employeName="Dimple";
	public HotelName hotelName = HotelName.Hotel_1;
	
	public Software(String employeName,String project, HotelName hotelName) {
		super();
		this.employeName = employeName;
		Software.project=project;
		this.hotelName=hotelName;
		//this.COMPANY=COMPANY;
	}
	
	static {
		COMPANY="Trigeo Technologies.pvt.ltd";
		project="BPO";
		//System.out.println(COMPANY);
	}
	public void ShowOff() {
		System.out.println(this.employeName);
		System.out.println(Software.project);
		System.out.println(Software.COMPANY);
		System.out.println(hotelName.name);
	}
}
