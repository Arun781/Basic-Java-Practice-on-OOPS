package com.xworkz.setget.classes;

public class BottomWareAlter {
public void Alter(BottomWare bottomWare) {
	bottomWare.setBrand(null);
	bottomWare.setTypeOfFabric(null);
	bottomWare.setPrice(0);
	bottomWare.setAmbassador(null);
	bottomWare.setName(null);
	bottomWare.setBrandOwner(null);
	bottomWare.setManufacturedInCountry(null);
	bottomWare.setManufacturingDate(null);
	bottomWare.setLastsUpto(null);
	bottomWare.setColor(null);
	bottomWare.setSize(0);
	
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
	
}
}
