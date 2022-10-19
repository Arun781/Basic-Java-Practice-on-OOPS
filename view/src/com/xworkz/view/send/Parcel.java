package com.xworkz.view.send;

public class Parcel {
	public String name;
	public String place;
	public int price;
	public float weight;
	public long customerNum;
	public String [] parcelName;
	public String [] transpotyBy;
	public String [] servies;
	public String [] diff;
	public String [] transport;
	
	public Parcel() {
		System.out.println("The Declaring the information of goods and services");
	}
	public Parcel(String name,String place,int price,float weight, long customerNum,String [] parcelName, String [] transpotyBy, String [] servies,String [] diff,String [] transport) {
		this.name=name;
		this.place=place;
		this.price=price;
		this.weight=weight;
		this.customerNum=customerNum;
		this.parcelName=parcelName;
		this.transpotyBy=transpotyBy;
		this.servies=servies;
		this.diff=diff;
		this.transport=transport;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.price);
		System.out.println(this.weight);
		System.out.println(this.customerNum);
		System.out.println(this.parcelName);
		System.out.println(this.transpotyBy);
		System.out.println(this.servies);
		System.out.println(this.diff);
		System.out.println(this.transport);
		
		System.out.println(System.lineSeparator());
		
		for (int i = 0; i < parcelName.length; i++) {
			String ref = parcelName[i];
			System.out.println(ref);
			
		}
		for (int i = 0; i < transpotyBy.length; i++) {
			String ref = transpotyBy[i];
			System.out.println(ref);
			
		}
		for (int i = 0; i < servies.length; i++) {
			String ref = servies[i];
			System.out.println(ref);
			
		}
		for (int i = 0; i < diff.length; i++) {
			String ref = diff[i];
			System.out.println(ref);
			
		}
		for (int i = 0; i < transport.length; i++) {
			String ref = transport[i];
			System.out.println(ref);
			
		}
	}
	


}
