package com.xworkz.interaction.rules;

public class XworkzRajajinagar implements Xworkz,TestingInstitute,DevelopmentInstitute,Institute{

	@Override
	public boolean teaching() {
		System.out.println("Running teching");
		return false;
	}

	@Override
	public String nameOfPro() {
		System.out.println("Running nameOfPro");
		return null;
	}

	@Override
	public int numOfTrainees() {
		System.out.println(50);
		return 0;
	}

}
