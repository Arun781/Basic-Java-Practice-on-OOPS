package com.xworkz.setget.runner;

import com.xworkz.setget.classes.BottomWare;
import com.xworkz.setget.classes.BottomWareAlter;

public class BottomWareRunner {

	public static void main(String[] args) {
		BottomWare bottomWare = new BottomWare();
		System.out.println(bottomWare.getBrand());
		System.out.println(bottomWare.getTypeOfFabric());
		System.out.println(bottomWare.getPrice());
		System.out.println(bottomWare.getAmbassador());
		System.out.println(bottomWare.getName());
		System.out.println(bottomWare.getBrandOwner());
		System.out.println(bottomWare.getManufacturedInCountry());
		System.out.println(bottomWare.getManufacturingDate());
		System.out.println(bottomWare.getLastsUpto());
		System.out.println(bottomWare.getColor());
		System.out.println(bottomWare.getSize());
		System.out.println("===========================");
		BottomWareAlter bottomWareAlter = new BottomWareAlter();
		bottomWareAlter.Alter(bottomWare);
	}

}
