package com.xworkz.casting.main;

import com.xworkz.enums.Camcorder;

public class PreWeddingShoot {
	public String name;
	public String location;
	public Camcorder camcorderType ;

	public PreWeddingShoot() {
		System.out.println("The default constructor of PreWeddingShoot created");
	}

	public PreWeddingShoot(String name, String location, Camcorder camcorderType) {
		super();
		this.name = name;
		this.location = location;
		this.camcorderType = camcorderType;
	}
	
	public void Showoff() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(camcorderType);
	}
}
