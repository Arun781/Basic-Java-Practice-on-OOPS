package com.xworkz.view.Cars;

import com.xworkz.view.constant.CarsDetails;

public class Specification {
	public String name;
	public String brand;
	public double model;
	public long price;
	public String [] fuel;
	public String [] cC;
	public CarsDetails carsDetails = CarsDetails.Black;
	public CarsDetails carsDetails1 = CarsDetails.Silver;
	
	
	public Specification(String name, String brand, double model, long price, String[] fuel, String[] cC,
			CarsDetails carsDetails, CarsDetails carsDetails1) {
		super();
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.fuel = fuel;
		this.cC = cC;
		this.carsDetails = carsDetails;
		this.carsDetails1 = carsDetails1;
	}

	public void Dispaly() {
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.price);
		System.out.println(this.fuel);
		System.out.println(this.cC);
		System.out.println(this.carsDetails);
		System.out.println(this.carsDetails1);
		
		System.out.println(System.lineSeparator());
		
		for (int i = 0; i < fuel.length; i++) {
			String ref = fuel[i];
			System.out.println(ref);
		}
		for (int i = 0; i < cC.length; i++) {
			String ref = cC[i];
			System.out.println(ref);
		}
	}

}
