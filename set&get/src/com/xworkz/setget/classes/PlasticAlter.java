package com.xworkz.setget.classes;

public class PlasticAlter {
	public void plasticAlter(Plastic plastic) {
		plastic.setName(null);
		plastic.setBrandName(null);
		plastic.setQuality(false);
		plastic.setUsedfor(null);
		plastic.setPrice(0);
		plastic.setLength(0);
		plastic.setWidth(0);
		plastic.setWeigthingrams(0);
		plastic.setColour(null);
		plastic.setHydrobromide(0);
		plastic.setHydrochloride(0);
		
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
