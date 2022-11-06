package com.xworkz.setget.classes;

public class PerfumeAlter {
public void Alter(Perfume perfume) {
	perfume.setBrand("USTRAA Base");
	perfume.setName("Eau de Parfum Eau de Parfum");
	perfume.setBrandOwner("Vipul Solanki");
	perfume.setManufactureCountry("UK");
	perfume.setPrice(999);
	perfume.setExpiryDate("2022/02/11");
	perfume.setQuality(false);
	perfume.setQuantity(100);
	perfume.setFragrance("Fresh");
	perfume.setColour("Blue");
	 
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
