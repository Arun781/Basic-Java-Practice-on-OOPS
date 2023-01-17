package com.xworkz.crocoFestival.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	@Autowired
	public Provider provider;
	
	public Airtel() {
		System.out.println("Created no arg constructor in Airtel......");
	}

	@Override
	public void connect() {
		System.out.println("OverRidden Browse Method From connect...");

	}
}
