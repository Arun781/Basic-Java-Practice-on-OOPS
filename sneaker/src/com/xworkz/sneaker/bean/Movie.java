package com.xworkz.sneaker.bean;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private Director pirector;
	private Producer producer;

	public Movie() {
		System.out.println("Created the Movie using no arg const...");
	}
}
