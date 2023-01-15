package com.xworkz.sneaker.bean;

import org.springframework.stereotype.Component;

@Component
public class Assistant {
	private Company company;

	public Assistant() {
		System.out.println("Created the Assistant using the no arg const....");
	}

}
