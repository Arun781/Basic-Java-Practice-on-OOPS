package com.xworkz.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Demo {
	private String name;

	private long contactNo;

	private String color;

	public Demo() {
		System.out.println("Demo is Rinning");
	}

	public String getName() {
		return name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public String getColor() {
		return color;
	}

	@Value("Aishwarya")
	public void setName(String name) {
		this.name = name;
	}

	@Value("457464")
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Value("RED")
	public void setColor(String color) {
		this.color = color;
	}

}
