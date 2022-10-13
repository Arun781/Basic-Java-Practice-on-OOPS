package com.xworkz.schemer.passport;

public class PassPortRunner {

	public static void main(String[] args) {
		PassPort connection= new PassPort(3256425l,"XYZ");
		PassPort connection1= new PassPort(120d,12052022l);
		PassPort connection2= new PassPort("India",11012022l);
		System.out.println(connection.numberOfPassPort);
		System.out.println(connection.nameOnPassPort);
		System.out.println(connection.price);
		System.out.println(connection.expiryDate);
		System.out.println(connection.Country);
		System.out.println(connection.issueDate);
		System.out.println("==========================================");
		System.out.println(connection1.numberOfPassPort);
		System.out.println(connection1.nameOnPassPort);
		System.out.println(connection1.price);
		System.out.println(connection1.expiryDate);
		System.out.println(connection1.Country);
		System.out.println(connection1.issueDate);
		System.out.println("==========================================");
		System.out.println(connection2.numberOfPassPort);
		System.out.println(connection2.nameOnPassPort);
		System.out.println(connection2.price);
		System.out.println(connection2.expiryDate);
		System.out.println(connection2.Country);
		System.out.println(connection2.issueDate);
		System.out.println("==========================================");

	}

}
