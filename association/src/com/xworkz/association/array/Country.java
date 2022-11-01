package com.xworkz.association.array;

public class Country {
	public String name;
	public City[] cities;
	public President president;

	public Country(String name) {
		this.name = name;
	}
	public void setPresident(President president) {
		this.president = president;
	}
	public void setCities(City[] cities) {
		this.cities = cities;
	}
	public void Showoff() {
		if (cities != null) {
			for (int j = 0; j < cities.length; j++) {
				City city = cities[j];
				if (city != null) {
					city.showOff();
				} else {
					System.out.println("City is null in index" + j);
				}
			}
		}
		System.out.println("Country Name" + name);
		//System.out.println("President detailes" + president);
		if (this.president!=null) {
		president.ShowOffer();
	}

	}
}
