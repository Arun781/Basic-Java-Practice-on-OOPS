package com.xworkz.association.classfiles;
//God : name, gender, mainPower,weapon
public class God {
	public String name;
	public char gender;
	public String mainPower;
	public String weapon;
	public God(String name, char gender, String mainPower, String weapon) {
		super();
		this.name = name;
		this.mainPower = mainPower;
		this.weapon = weapon;
	}
	public void ShowOff() {
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainPower);
		System.out.println(this.weapon);
	}
}
