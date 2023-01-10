package com.xworkz.maven.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	private String name;
	@Value("Rohini Technology Payload")
	private String country;
	@Value("12500000")
	private Double price;

	public Rocket() {
		System.out.println("Running the default Rocket by Spring");
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public Double getPrice() {
		return price;
	}

}
