package com.xworkz.view.Cars;

import com.xworkz.view.constant.CarsDetails;

public class SpecificationRunner {

	public static void main(String[] args) {
		String[] fuelSystem = { "Petrol Engine", "Disel Engine", "Electric" };
		String[] cubicCapacity = { "1200", "1400", "1600", "1800" };
		Specification ref = new Specification("Creata", "Honda", 2022, 2500000, fuelSystem, cubicCapacity,
				CarsDetails.Black, CarsDetails.Blue);
		ref.Dispaly();
	}

}
