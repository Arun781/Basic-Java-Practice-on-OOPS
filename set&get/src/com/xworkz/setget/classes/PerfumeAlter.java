package com.xworkz.setget.classes;

public class PerfumeAlter {
public void Alter(Perfume perfume) {
	perfume.setBrand(null);
	perfume.setName(null);
	perfume.setBrandOwner(null);
	perfume.setManufactureCountry(null);
	perfume.setPrice(0);
	perfume.setExpiryDate(null);
	perfume.setQuality(false);
	perfume.setQuantity(0);
	perfume.setFragrance(null);
	perfume.setColour(null);
	 
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
	
	
	
}
}
