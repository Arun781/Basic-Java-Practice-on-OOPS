package com.xworkz.sudowdo.runner;

import com.xworkz.sudowdo.main.Chain;

public class ChainRnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain ref =new Chain(null);
		System.out.println(ref.nameOfChain);
		System.out.println("_________________________________________________________________________________________________");

		Chain ref1 =new Chain("Wippermann");
		System.out.println(ref1.nameOfChain);
		System.out.println(ref1.price);
		System.out.println(ref1.length);
		System.out.println(ref1.material);
		System.out.println(ref1.stolen);
		System.out.println(ref1.usedFor);
		System.out.println(ref1.freash);
		System.out.println("_________________________________________________________________________________________________");

		Chain ref2 =new Chain("Wippermann",250);
		System.out.println(ref2.nameOfChain);
		System.out.println(ref2.price);
		System.out.println(ref2.length);
		System.out.println("_________________________________________________________________________________________________");

		Chain ref3 =new Chain("Wippermann",250,12.5f);
		System.out.println(ref3.nameOfChain);
		System.out.println(ref3.price);
		System.out.println(ref3.length);
		System.out.println(ref3.material);
		System.out.println("_________________________________________________________________________________________________");


		Chain ref4 =new Chain("Wippermann",250,12.5f,"Steel");
		System.out.println(ref4.nameOfChain);
		System.out.println(ref4.price);
		System.out.println(ref4.length);
		System.out.println(ref4.material);
		System.out.println("_________________________________________________________________________________________________");


		Chain ref5 =new Chain("Wippermann",250,12.5f,"Steel",15.5f);
		System.out.println(ref5.nameOfChain);
		System.out.println(ref5.price);
		System.out.println(ref5.length);
		System.out.println(ref5.material);
		System.out.println(ref5.weight);
		System.out.println("_________________________________________________________________________________________________");

		Chain ref6 =new Chain("Wippermann",250,12.5f,"Steel",15.5f,true);
		System.out.println(ref6.nameOfChain);
		System.out.println(ref6.price);
		System.out.println(ref6.length);
		System.out.println(ref6.material);
		System.out.println(ref6.weight);
		System.out.println(ref6.stolen);
		System.out.println("_________________________________________________________________________________________________");

		
		Chain ref7 =new Chain("Wippermann",250,12.5f,"Steel",15.5f,true,"Bycycle","new One");
		System.out.println(ref7.nameOfChain);
		System.out.println(ref7.price);
		System.out.println(ref7.length);
		System.out.println(ref7.material);
		System.out.println(ref7.weight);
		System.out.println(ref7.stolen);
		System.out.println(ref7.usedFor);
		System.out.println("_________________________________________________________________________________________________");

	}

}
