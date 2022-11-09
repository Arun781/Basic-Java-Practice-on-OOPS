package com.xworkz.casting.main;

import com.xworkz.enums.Camcorder;

public class PhotoShoot extends PreWeddingShoot {
	public String name="Chethan";
	public long num=6363454578l;
	public PhotoShoot() {
		System.out.println("The default constructor of PhotoShoot created");
	}

	public PhotoShoot(String name, String location, Camcorder camcorderType) {
		super(name, location, camcorderType);
		
		// TODO Auto-generated constructor stub
	}
	public PhotoShoot(String name, long num) {
		super();
		this.name = name;
		this.num = num;
	}

	public void Showoff() {
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(num);
		System.out.println(location);
		System.out.println(camcorderType);
	}

}
