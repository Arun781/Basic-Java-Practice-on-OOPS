package com.xworkz.view.boot;

import java.util.Iterator;

import sun.misc.FormattedFloatingDecimal.Form;

public class MassTransits {
	public String name;
	public String boardingPoint;
	public String destination;
	public int price;
	public int seatNum;
	public String [] places;
	public String [] typesOfTrains;
	public String [] junction;
	public String [] namesOfTc;
	public String [] coaches;
	public String [] availabilityIncludes;
	
	public MassTransits() {
		System.out.println("Declaring the information about MassTransits");
	}
	public MassTransits(String name,String boardingPoint,String destination,int price,int seatNum,String [] places,String [] typesOfTrains,String [] junction,String [] namesOfTc,String [] coaches,String [] availabilityIncludes) {
		this.name=name;
		this.boardingPoint=boardingPoint;
		this.destination=destination;
		this.price=price;
		this.seatNum=seatNum;
		this.places=places;
		this.typesOfTrains=typesOfTrains;
		this.junction=junction;
		this.namesOfTc=namesOfTc;
		this.coaches=coaches;
		this.availabilityIncludes=availabilityIncludes;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.boardingPoint);
		System.out.println(this.destination);
		System.out.println(this.price);
		System.out.println(this.seatNum);
		System.out.println(this.places);
		System.out.println(this.typesOfTrains);
		System.out.println(this.junction);
		System.out.println(this.namesOfTc);
		System.out.println(this.coaches);
		System.out.println(this.availabilityIncludes);
		
		System.out.println(System.lineSeparator()+"compartmentsName:");
	    
		for (int i = 0; i < places.length; i++) {
			String ref = places[i];
			System.out.println(ref);
		}
		for (int i = 0; i < typesOfTrains.length; i++) {
			String prefer=typesOfTrains[i];
			System.out.println(prefer);	
		}
		for (int i = 0; i < availabilityIncludes.length; i++) {
			String prefer = availabilityIncludes[i];
			System.out.println(prefer);
		}
		for (int i = 0; i < junction.length; i++) {
			String ref = junction[i];
			System.out.println(ref);
		}
		for (int i = 0; i < namesOfTc.length; i++) {
			String prefer = namesOfTc[i];
			System.out.println(prefer);
		}
		for (int i = 0; i < coaches.length; i++) {
			String prefer = coaches[i];
			System.out.println(prefer);
		}
	}
	
}
