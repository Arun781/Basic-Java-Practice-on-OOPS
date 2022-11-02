package com.xworkz.setget.runner;

import com.xworkz.setget.classes.StoreManager;
import com.xworkz.setget.classes.StoreManagerAlter;

public class StoreManagerRunner {

	public static void main(String[] args) {
		StoreManager storeManager= new StoreManager();
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
		System.out.println("==============================================");
		StoreManagerAlter storeManagerAlter = new StoreManagerAlter();
		storeManagerAlter.Alter(storeManager);
		

	}

}
