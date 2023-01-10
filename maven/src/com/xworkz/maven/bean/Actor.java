package com.xworkz.maven.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	private String name;
	private String lang;
	private int age;

	public Actor(@Value("Darshan") String name, @Value("Kannada") String lang, @Value("45") int age) {
		super();
		this.name = name;
		this.lang = lang;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getLang() {
		return lang;
	}

	public int getAge() {
		return age;
	}

}
