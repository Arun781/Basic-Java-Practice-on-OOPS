package com.xworkz.bigfish.dc;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Declaring the information about DistrictCollector");
		DistrictCollector backing= new DistrictCollector();
		System.out.println(backing.name);
		System.out.println(backing.age);
		System.out.println(backing.districtName);
		System.out.println(backing.batchNo);
		backing.name = "Sri Anirudh Sravan P Deputy";
		backing.age  = 35;
		backing.districtName="Vijayanagar";
		backing.batchNo=2011;
		System.out.println(backing.name);
		System.out.println(backing.age);
		System.out.println(backing.districtName);
		System.out.println(backing.batchNo);
		

	}

}
