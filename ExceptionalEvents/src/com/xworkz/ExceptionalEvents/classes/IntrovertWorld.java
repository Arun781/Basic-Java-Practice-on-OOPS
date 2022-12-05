package com.xworkz.ExceptionalEvents.classes;

import com.xworkz.ExceptionalEvents.interfaces.KarnatakaRTO;

public class IntrovertWorld extends JavaTrainee implements KarnatakaRTO {

	@Override
	public double vat() {
		System.out.println("Running vat");
		return 0;
	}

	public IntrovertWorld(String name) {
		super();
		this.name=name;
		
	}

	@Override
	public String training() {
		System.out.println("Running training");
		return null;
	}

	@Override
	public boolean sleep1() {
		System.out.println("Running sleep1");
		return false;
	}

	@Override
	public boolean sleep() {
		System.out.println("Running sleep");
		return false;
	}
	@Override
	public String eat() {
		System.out.println("Running the eat");
		return"Helo";
	}

}
