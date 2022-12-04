package com.xworkz.interaction.rules;

public  class YesBank implements BankRules{

	@Override
	public long maxAmount() {
		System.out.println("Running the MAxAmount of the Yes Bank");
		return 0;
	}
	@Override
	public double minAmount() {
		System.out.println("Running the Min Amount of the Yes Bank");
		return 0;
	}
}