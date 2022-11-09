package com.xworkz.casting.parent;

public class PoliticalParty {
	public String name;
	public double since;
	public String country;

	public PoliticalParty() {
		System.out.println("Created default constructor of PoliticalParty class");
	}

	public PoliticalParty(String name, double since, String country) {
		super();
		this.name = name;
		this.since = since;
		this.country = country;
	}

	public void ShowOff() {
		System.out.println(name);
		System.out.println(since);
		System.out.println(country);
	}

}
