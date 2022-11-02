package com.xworkz.setget.runner;

import com.xworkz.setget.classes.Bike;
import com.xworkz.setget.classes.BikeModify;

public class BikeRunner {

	public static void main(String[] args) {
		Bike prefer = new Bike();
		System.out.println(prefer.getBikeBrand());
		System.out.println(prefer.getBore());
		System.out.println(prefer.getWheelSizeback());
		System.out.println(prefer.getWheelSizerear());
		System.out.println(prefer.getWheelsType());
		System.out.println(prefer.getEngineDisplacement());
		System.out.println(prefer.getEngineType());
		System.out.println(prefer.getMaxTorque());
		System.out.println(prefer.getSpeedometer());
		System.out.println(prefer.getStroke());
		System.out.println(prefer.getModelName());
		System.out.println("=======================================");
		BikeModify bikeModify= new BikeModify();
		bikeModify.alter(prefer);
		System.out.println(prefer);
		
	}

}
