package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Phone;

public class PhoneFollow implements Phone {

	@Override
	public String nameOfPhone() {
		System.out.println("nameOfPhone");
		return null;
	}

	@Override
	public String modelOfPhone() {
		System.out.println("modelOfPhone");
		return null;
	}

	@Override
	public String configOfPhone() {
		System.out.println("configOfPhone");
		return null;
	}

	@Override
	public double priceOfPhone() {
		System.out.println("priceOfPhone");
		return 0;
	}

	@Override
	public double yearOfPhone() {
		System.out.println("yearOfPhone");
		return 0;
	}

}
