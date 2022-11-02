package com.xworkz.setget.classes;

public class PhoneModify {
public void alterPhone(Phone phone) {
	phone.setBrand(null);
	phone.setType(null);
	phone.setModel(0);
	phone.setPrice(0);
	phone.setNum(0);
	phone.setOwner(null);
	phone.setStorage(0);
	phone.setChargerType('M');
	phone.setStorage(0);
	phone.setSimType(null);
	phone.setSensors(null);
	
	System.out.println(phone.getBrand());
	System.out.println(phone.getType());
	System.out.println(phone.getModel());
	System.out.println(phone.getPrice());
	System.out.println(phone.getNum());
	System.out.println(phone.getOwner());
	System.out.println(phone.getChargerType());
	System.out.println(phone.getStorage());
	System.out.println(phone.getRom());
	System.out.println(phone.getColur());
	System.out.println(phone.getSimType());
	System.out.println(phone.getSensors());
	
}
}
