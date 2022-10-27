package com.xworkz.association.classfiles;
//Brand: name,gstNo,location:custom,rating
public class Brand {
	public String name;
	public long gstNum;
	public Brand(String name, long gstNum) {
		super();
		this.name = name;
		this.gstNum = gstNum;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.gstNum);
	}
	
}
