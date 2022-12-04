package com.xworkz.interaction.rules;

public class Passenger implements MetroRules{

	@Override
	public boolean wearMask() {
		System.out.println("The Running the Wear Mask");
		return true;
	}

	@Override
	public double ticketPrice() {
		System.out.println("Running the ticket price");
		return 0;
	}

}
