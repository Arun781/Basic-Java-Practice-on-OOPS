package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Company;

public class CompanyRules implements Company {

	@Override
	public String nameOfCompany() {
		System.out.println("The companny Name is Xworkz");
		return null;
	}

	@Override
	public String loctaionOfCompany() {
		System.out.println("The Location of the Company is X_WORKZ");
		return null;
	}

	@Override
	public String modeOfCompany() {
		System.out.println("Work From Office");
		return null;
	}

	@Override
	public double totalMemInCompany() {
		System.out.println("The totalMemInCompany :-"+150);
		return 0;
	}

	@Override
	public String rulesOfCompany() {
		System.out.println("Should complete Task");
		return null;
	}

}
