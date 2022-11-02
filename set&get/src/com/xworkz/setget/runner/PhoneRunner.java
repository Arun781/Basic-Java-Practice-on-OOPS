package com.xworkz.setget.runner;

import com.xworkz.setget.classes.Phone;
import com.xworkz.setget.classes.PhoneModify;

public class PhoneRunner {;

	public static void main(String[] args) {
		Phone phone = new Phone();
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
		System.out.println("================================");
		PhoneModify phoneModify = new PhoneModify();
		phoneModify.alterPhone(phone);
		System.out.println(phone);
	}

}
