package com.xworkz.interaction.runner;

import com.xworkz.interaction.rules.Driver;
import com.xworkz.interaction.rules.Passenger;

public class MetroRulesRunner {

	public static void main(String[] args) {
		Passenger ref = new Passenger();
		Driver driver= new Driver(ref);
		driver.checkPassenger();
		

	}

}
