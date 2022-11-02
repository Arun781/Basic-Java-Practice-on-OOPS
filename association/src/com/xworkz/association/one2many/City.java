package com.xworkz.association.one2many;

public class City {
	public String cityName;
	public String nameOfMp;
	public boolean city=true;
	public String presentName;
	public City(String cityName, String nameOfMp, boolean city, String presentName) {
		super();
		this.cityName = cityName;
		this.nameOfMp = nameOfMp;
		this.city = city;
		this.presentName = presentName;
	}
	public void ShowOff() {
		System.out.println("=====================================================");
		System.out.println("Declaring the City info");
		System.out.println(this.cityName);
		System.out.println(this.nameOfMp);
		System.out.println(this.city);
		System.out.println(this.presentName);
	}
	
	

}
