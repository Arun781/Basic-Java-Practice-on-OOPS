package com.xworkz.association.classfiles;

public class Mountains {

	public String name;
	public Locations location = new Locations("MUllayyanagiru", "Chikkamagaluru", "Karnataka", 577542, "India");
	public double height;

	public Mountains(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public void showoff() {

		System.out.println("Mountaion naditha ede");

		System.out.println(this.name);
		System.out.println(this.height);
		this.location.showoff();

	}

}
