package com.xworkz.sneaker.bean;

import org.springframework.stereotype.Component;

@Component
public class Location {
	private Area area;
	public Location() {
		System.out.println("Created the Companu using no are const....");
	}
}
