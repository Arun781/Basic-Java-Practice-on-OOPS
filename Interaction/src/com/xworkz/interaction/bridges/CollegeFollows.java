package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.CollegeRules;

public class CollegeFollows implements CollegeRules {

	@Override
	public String name() {
		System.out.println("PDIT");
		return null;
	}

	@Override
	public String StudentsRules() {
		System.out.println("Shoudlnot Rag anyone, Should be on time");
		return null;
	}

	@Override
	public String StaffRules() {
		System.out.println("Have to syllubus in time");
		return null;
	}

	@Override
	public double timings() {
		System.out.println("The College timings are :- "+9.30);
		return 0;
	}

	@Override
	public String place() {
		System.out.println("Vijayanagar");
		return null;
	}

}
