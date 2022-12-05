package com.xworkz.ExceptionalEvents.interfaces;

public interface KarnatakaRTO extends TransportsRules {

	@Override
	default boolean paidTax(double amount) {
		System.out.println("Printing paid tax");
		System.out.println(amount);
		return false;
	}

	@Override
	default double gst() {
		System.out.println("Printing gst");
		return 0;
	}

	double vat();
}
