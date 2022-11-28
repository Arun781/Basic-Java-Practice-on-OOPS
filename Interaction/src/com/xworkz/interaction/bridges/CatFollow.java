package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Cat;

public class CatFollow implements Cat{

	@Override
	public String NameOfCat() {
		System.out.println("NameOfCat");
		return null;
	}

	@Override
	public String breadOfCat() {
		System.out.println("breadOfCat");
		return null;
	}

	@Override
	public int ageOfCat() {
		System.out.println("ageOfCat");
		return 0;
	}

	@Override
	public double weightOfCat() {
		System.out.println("weightOfCat");
		return 0;
	}

	@Override
	public String ownerOfCat() {
		System.out.println("ownerOfCat");
		return null;
	}

}
