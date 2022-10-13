package com.xworkz.schemer.boat;

public class BoatRunner {

	public static void main(String[] args) {
		Boat index = new Boat("", "");
		index.name = "Aman Gupta Biography";
		index.color = "black";
		index.companyName = "Indian School of Business";
		index.type = 'M';
		index.owner = "Neeraj Gupta";
		System.out.println(index.name);
		System.out.println(index.color);
		System.out.println(index.companyName);
		System.out.println(index.type);
		System.out.println(index.owner);

		Boat index1 = new Boat("", 'L');
		index1.name = "Mia Gupta";
		index1.color = "Blue";
		index1.companyName = "American";
		index1.type = 'S';
		index1.owner ="Indian School of Business";
		System.out.println(index1.name);
		System.out.println(index1.color);
		System.out.println(index1.companyName);
		System.out.println(index1.type);
		System.out.println(index1.owner);
		
		Boat index2= new Boat("");
		index2.name ="Kochar Gupta";
		index2.color ="red";
		index2.companyName ="R.K. Puram";
		index2.type = 'B';
		index2.owner = "Aman Gupta";
		System.out.println(index2.name);
		System.out.println(index2.color);
		System.out.println(index2.companyName);
		System.out.println(index2.type);
		System.out.println(index2.owner);
	}

}
