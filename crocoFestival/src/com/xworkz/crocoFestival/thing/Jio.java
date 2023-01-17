package com.xworkz.crocoFestival.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	@Autowired
	public Provider provider;

	public Jio() {
		System.out.println("Created no arg constructor in Jio......");
	}

	@Override
	public void connect() {
		System.out.println("OverRidden Browse Method From connect...");

	}

}
