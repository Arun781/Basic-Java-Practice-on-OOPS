package com.xworkz.crocoFestival.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser {
	@Autowired
	@Qualifier("airtel")
	public Provider provider;

	public FireBox() {
		System.out.println("Created no arg constructor in FireBox......");
	}

	@Override
	public void browse() {
		System.out.println("OverRidden Browse Method From Browser...");
		provider.connect();
	}
	
}
