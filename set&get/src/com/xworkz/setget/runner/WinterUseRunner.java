package com.xworkz.setget.runner;

import com.xworkz.setget.classes.WinterAlter;
import com.xworkz.setget.classes.WinterUse;

public class WinterUseRunner {

	public static void main(String[] args) {
		WinterUse winterUse = new WinterUse();
		System.out.println(winterUse.getBrand());
		System.out.println(winterUse.getType());
		System.out.println(winterUse.getBrand());
		System.out.println(winterUse.getManufactureCountry());
		System.out.println(winterUse.getManufactureDate());
		System.out.println(winterUse.getFounder());
		System.out.println(winterUse.getQuantity());
		System.out.println(winterUse.getSize());
		System.out.println(winterUse.getColour());
		WinterAlter winterAlter = new WinterAlter();
		winterAlter.altering(winterUse);
	}

}
