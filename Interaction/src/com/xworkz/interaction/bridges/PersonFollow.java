package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Person;

public class PersonFollow implements Person {

	@Override
	public String nameOfPerson() {
		System.out.println("");
		return null;
	}

	@Override
	public int ageOfPerson() {
		System.out.println("ageOfPerson");
		return 0;
	}

	@Override
	public long phoneNumOfPerson() {
		System.out.println("phoneNumOfPerson");
		return 0;
	}

	@Override
	public String locationOfPerson() {
		System.out.println("locationOfPerson");
		return null;
	}

	@Override
	public String personDOB() {
		System.out.println("personDOB");
		return null;
	}

}
