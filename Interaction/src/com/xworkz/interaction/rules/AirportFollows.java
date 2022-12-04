package com.xworkz.interaction.rules;

public class AirportFollows implements Airport {

	@Override
	public double price() {
		System.out.println("Running the price");
		return 0;
	}

	@Override
	public float timing() {
		System.out.println("Running the price");
		return 0;
	}

}
