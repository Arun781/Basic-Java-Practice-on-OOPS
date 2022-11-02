package com.xworkz.setget.classes;

public class StoreManagerAlter {
	public void Alter(StoreManager storeManager) {
		storeManager.setBrand(null);
		storeManager.setBrandOwner(null);
		storeManager.setExpiryDate(null);
		storeManager.setManufacturedInCountry(null);
		storeManager.setFragrance(null);
		storeManager.setAmbassador(null);
		storeManager.setManufacturingDate(null);
		storeManager.setExpiryDate(null);
		storeManager.setQuanity(0);
		storeManager.setName(null);
		
		System.out.println(storeManager.getBrand());
		System.out.println(storeManager.getBrandOwner());
		System.out.println(storeManager.getExpiryDate());
		System.out.println(storeManager.getManufacturedInCountry());
		System.out.println(storeManager.getFragrance());
		System.out.println(storeManager.getAmbassador());
		System.out.println(storeManager.getManufacturingDate());
		System.out.println(storeManager.getExpiryDate());
		System.out.println(storeManager.getQuanity());
		System.out.println(storeManager.getName());
		
		
	}

}
