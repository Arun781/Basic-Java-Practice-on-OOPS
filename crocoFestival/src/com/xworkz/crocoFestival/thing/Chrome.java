package com.xworkz.crocoFestival.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	@Autowired
	public Browser browser;

	public Chrome() {
		System.out.println("Created no arg constructor in Chrome......");
	}

	@Override
	public void browse() {
		
		System.out.println("OverRidden Browse Method From Browser...");

	}

}
