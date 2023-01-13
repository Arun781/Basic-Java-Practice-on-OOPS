package com.xworkz.sneaker.bean;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private String capacity;
	public Battery() {
		System.out.println("Created the Capacity using the no arg const....");
	}
}
