package com.xworkz.association.array;

public class City {
	public Name name;
	public String capital;
	public double areaInSK;
	
	public City(Name name, String capital, double areaInSK) {
		super();
		this.name = name;
		this.capital = capital;
		this.areaInSK = areaInSK;
	}
	public void showOff() {
		//System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.areaInSK);
	}

}
