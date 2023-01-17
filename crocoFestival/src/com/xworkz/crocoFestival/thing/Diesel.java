package com.xworkz.crocoFestival.thing;


public class Diesel implements Fuel{
	public Fuel fuel;
	
	public Diesel() {
		System.out.println("Created th no arg const Fuel...");
	}
	@Override
	public void consume() {
		System.out.println("Created and overide the consume in Disel");
		
	}

}
