package com.xworkz.interaction.rules;

public class Visitors implements VisitorsRules  {

	@Override
	public boolean smoking() {
		System.out.println("Running the smoking");
		return false;
	}

	@Override
	public int minDeposit() {
		System.out.println("Running the mustFollow");
		return 0;
	}

}
