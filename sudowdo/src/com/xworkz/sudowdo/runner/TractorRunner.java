package com.xworkz.sudowdo.runner;

import com.xworkz.sudowdo.main.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tractor ref=new Tractor(null);
		System.out.println(ref.name);
		System.out.println(ref.brand);
		System.out.println(ref.price);
		System.out.println(ref.color);
		System.out.println(ref.model);
		System.out.println(ref.hp);
		System.out.println("_________________________________________________________________________________________________");

		Tractor ref1=new Tractor("Arun");
		System.out.println(ref1.name);
		System.out.println(ref1.brand);
		System.out.println(ref1.price);
		System.out.println(ref1.color);
		System.out.println(ref1.model);
		System.out.println(ref1.hp);
		System.out.println("_________________________________________________________________________________________________");

		Tractor ref2=new Tractor("Arun","myself",350405d);
		System.out.println(ref2.name);
		System.out.println(ref2.brand);
		System.out.println(ref2.price);
		System.out.println(ref2.color);
		System.out.println(ref2.model);
		System.out.println(ref2.hp);
		System.out.println("_________________________________________________________________________________________________");

		Tractor ref3=new Tractor("Arun","myself",350405d,"Black");
		System.out.println(ref3.name);
		System.out.println(ref3.brand);
		System.out.println(ref3.price);
		System.out.println(ref3.color);
		System.out.println(ref3.model);
		System.out.println(ref3.hp);
		System.out.println("_________________________________________________________________________________________________");

		Tractor ref4=new Tractor("Arun","myself",350405d,"Black",2021d);
		System.out.println(ref4.name);
		System.out.println(ref4.brand);
		System.out.println(ref4.price);
		System.out.println(ref4.color);
		System.out.println(ref4.model);
		System.out.println(ref4.hp);
		System.out.println("_________________________________________________________________________________________________");

		Tractor ref5=new Tractor("Arun","myself",350405d,"Black",2021d,45);
		System.out.println(ref5.name);
		System.out.println(ref5.brand);
		System.out.println(ref5.price);
		System.out.println(ref5.color);
		System.out.println(ref5.model);
		System.out.println(ref5.hp);
		System.out.println("_________________________________________________________________________________________________");

		
		
		

		
	}

}
