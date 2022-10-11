package com.xworkz.bigfish.boot;
public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Declaring the Starting and Ending Destination Of the Bus with Bus Number");
		Bus ref=new Bus();
		System.out.println(ref.busNo);
		System.out.println(ref.starting);
		System.out.println(ref.destination);
		ref.busNo = 2354;
		ref.starting="JP Nagar";	
		ref.destination="Rajaji Nagar";
		System.out.println(ref.busNo);
		System.out.println(ref.starting);
		System.out.println(ref.destination);
	}
}
