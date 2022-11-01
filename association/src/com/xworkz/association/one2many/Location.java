package com.xworkz.association.one2many;

public class Location {
	public int num;
	public String name;
	public City city;
	public State state;
	public Country country;

	public Location(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public void setLocations(City city,State state,Country country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public void ShowOff() {
		System.out.println(this.num);
		System.out.println(this.name);
		if (this.city!=null) {
			city.ShowOff();
		}
		if (this.state!=null) {
			state.ShowOff();
		}
		if (this.country!=null) {
			country.ShowOff();
		}
	}

}
