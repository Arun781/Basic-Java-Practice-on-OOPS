package com.xworkz.crocoFestival.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {
	@Autowired
	public Fuel fuel;

	public Petrol() {
		System.out.println("Created the petrol no arg const...");
	}

	@Override
	public void consume() {
		System.out.println("Created the Consume....");

	}

}
