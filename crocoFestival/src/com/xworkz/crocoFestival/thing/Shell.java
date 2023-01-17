package com.xworkz.crocoFestival.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	@Autowired
	//private PetrolBunk petrolBunk;
	private Fuel fuel;
	//private Petrol petrol; tight coupling
	//private Diesel diesel;

	public Shell() {
		System.out.println("Running the no arg Const Shell ");
	}

	@Override
	public void purchase() {
		System.out.println("Running the purchase to call.....");
		//PetrolBunk.super.purchase();
	}

}
