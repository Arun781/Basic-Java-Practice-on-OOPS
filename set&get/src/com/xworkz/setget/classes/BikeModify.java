package com.xworkz.setget.classes;

public class BikeModify {
	
	public void alter(Bike bike) {
		bike.setBikeBrand(null);
		bike.setBore(0);
		bike.setWheelsType(null);
		bike.setModelName(0);
		bike.setEngineType(null);
		bike.setWheelSizerear(0);
		bike.setWheelSizeback(0);
		bike.setEngineDisplacement(0);
		bike.setMaxTorque(0);
		bike.setStroke(0);
		bike.setSpeedometer(null);
		
		System.out.println(bike.getBikeBrand());
		System.out.println(bike.getBore());
		System.out.println(bike.getWheelSizeback());
		System.out.println(bike.getWheelSizerear());
		System.out.println(bike.getWheelsType());
		System.out.println(bike.getEngineDisplacement());
		System.out.println(bike.getEngineType());
		System.out.println(bike.getMaxTorque());
		System.out.println(bike.getSpeedometer());
		System.out.println(bike.getStroke());
		System.out.println(bike.getModelName());
		
		
	}

}
