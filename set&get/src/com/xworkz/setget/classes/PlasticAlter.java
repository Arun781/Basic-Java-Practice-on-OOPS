package com.xworkz.setget.classes;

public class PlasticAlter {
	public void plasticAlter(Plastic plastic) {
		plastic.setName("Gottil");
		plastic.setBrandName("Waste");
		plastic.setQuality(false);
		plastic.setUsedfor("Filling waste");
		plastic.setPrice(0);
		plastic.setLength(0);
		plastic.setWidth(0);
		plastic.setWeigthingrams(2);
		plastic.setColour("Color blindness");
		plastic.setHydrobromide(01);
		plastic.setHydrochloride(5);
		
		System.out.println(plastic.getName());
		System.out.println(plastic.getBrandName());
		System.out.println(plastic.getUsedfor());
		System.out.println(plastic.getPrice());
		System.out.println(plastic.getLength());
		System.out.println(plastic.getWeigthingrams());
		System.out.println(plastic.getColour());
		System.out.println(plastic.getHydrobromide());
		System.out.println(plastic.getHydrochloride());
		
	}

}
