package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Car;

public class CarFollow implements Car {

	@Override
	public String NameOfCar() {
		System.out.println("NameOfCar");
		return null;
	}

	@Override
	public double priceOfCar() {
		System.out.println("priceOfCar");
		return 0;
	}

	@Override
	public String modelOfCar() {
		System.out.println("modelOfCar");
		return null;
	}

	@Override
	public double yearOfCar() {
		System.out.println("yearOfCar");
		return 0;
	}

	@Override
	public boolean typeOfCar() {
		System.out.println("typeOfCar");
		return false;
	}

}
