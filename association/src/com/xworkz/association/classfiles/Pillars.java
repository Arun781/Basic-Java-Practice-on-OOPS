package com.xworkz.association.classfiles;

import com.xworkz.association.constant.Height;

//Pillar : id,place,shape:enum,height,supporting,company:custom
public class Pillars {
	public int id;
	public String place;
	public Height height= Height.pillars_1;
	public Company company = new Company("Trigeo","Mapping");
	
	public Pillars(int id, String place,Height height) {
		super();
		this.id = id;
		this.place = place;
		this.height=height;
	}
	public void ShowOff() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.company);
		System.out.println(Height.pillars_1.height1);
		System.out.println(Height.pillars_1.shape);
		System.out.println(Height.pillars_1.supporting);
	}
	
}
