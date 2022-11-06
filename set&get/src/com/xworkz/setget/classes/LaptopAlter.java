package com.xworkz.setget.classes;

public class LaptopAlter {
public void Altering(Laptop laptop) {
	laptop.setBrand("HP");
	laptop.setModelName("15s-fr2511TU");
	laptop.setProcessorBrand("Intel");
	laptop.setProcessorName("Core-i7");
	laptop.setGraphicProcessor("Intel Integrated DDR5");
	laptop.setLaunchYear(2021);
	laptop.setCapacityOfSSD(516);
	laptop.setPrice(33200);
	laptop.setRam(32);
	laptop.setBatteryBackUp(4);
	laptop.setWarranty(6);
	
	System.out.println(laptop.getBrand());
	System.out.println(laptop.getModelName());
	System.out.println(laptop.getProcessorBrand());
	System.out.println(laptop.processorName);
	System.out.println(laptop.getGraphicProcessor());
	System.out.println(laptop.getLaunchYear());
	System.out.println(laptop.getCapacityOfSSD());
	System.out.println(laptop.getPrice());
	System.out.println(laptop.getRam());
	System.out.println(laptop.getBatteryBackUp());
	System.out.println(laptop.getWarranty());
}
}
