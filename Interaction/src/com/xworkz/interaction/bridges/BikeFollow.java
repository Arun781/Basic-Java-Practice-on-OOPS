package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Bike;

public class BikeFollow implements Bike {

	@Override
	public String NameOfBike() {
		System.out.println("NameOfBike");
		return null;
	}

	@Override
	public double priceOfBike() {
		System.out.println("priceOfBike");
		return 0;
	}

	@Override
	public String modelOfBike() {
		System.out.println("modelOfBike");
		return null;
	}

	@Override
	public double yearOfBike() {
		System.out.println("yearOfBike");
		return 0;
	}

	@Override
	public boolean typeOfBike() {
		System.out.println("typeOfBike");
		return false;
	}

}
