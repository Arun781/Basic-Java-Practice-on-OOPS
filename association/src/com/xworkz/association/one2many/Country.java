package com.xworkz.association.one2many;

public class Country {
	public String name;
	public String primeMinister;
	public double sqkm;
	public String capital;
	
	public Country(String name, String primeMinister, double sqkm, String capital) {
		super();
		this.name = name;
		this.primeMinister = primeMinister;
		this.sqkm = sqkm;
		this.capital = capital;
	}
	public void ShowOff() {
		System.out.println("=====================================================");
		System.out.println("Declaring the country info");
		System.out.println(this.name);
		System.out.println(this.primeMinister);
		System.out.println(this.sqkm);
		System.out.println(this.capital);
		System.out.println("=====================================================");
	}

}
