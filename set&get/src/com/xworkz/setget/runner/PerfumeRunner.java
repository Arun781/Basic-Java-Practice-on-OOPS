package com.xworkz.setget.runner;

import com.xworkz.setget.classes.Perfume;
import com.xworkz.setget.classes.PerfumeAlter;

public class PerfumeRunner {

	public static void main(String[] args) {
		Perfume perfume = new Perfume();
		System.out.println(perfume.getBrand());
		System.out.println(perfume.getName());
		System.out.println(perfume.getBrandOwner());
		System.out.println(perfume.getManufactureCountry());
		System.out.println(perfume.getPrice());
		System.out.println(perfume.getManufactureDate());
		System.out.println(perfume.getExpiryDate());
		System.out.println(perfume.getQuantity());
		System.out.println(perfume.getFragrance());
		System.out.println(perfume.getColour());
		PerfumeAlter perfumeAlter = new PerfumeAlter();
		perfumeAlter.Alter(perfume);
	}

}
