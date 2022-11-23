package com.xworkz.stylish.waste;

public class DustbinRunner {

	public static void main(String[] args) 
	{
		System.out.println("The uses and information about dustbins are");
		System.out.println("=================================================================");
		Dustbin dust = new Dustbin();
		dust.color="Blue";
		dust.shape="Square";
		dust.size=21d;
		dust.weight=5;
		dust.height=4;
		dust.typeDry="For Dry wastages";
		dust.typeWet="For wet wastages";
		dust.price=500;
		dust.uses="Biodegradable waste that includes organic waste e.g. kitchen waste, vegetables, flowers, etc. should decomposed in the green dustbin.\r\n"
				+ "The non-biodegradable waste such as glass should be thrown in the yellow dustbin, plastic waste should be thrown in the blue dustbin.\r\n"
				+ "The most hazardous waste should be thrown in the red dustbin and grey dustbin is used for metal wastes.";
		System.out.println("=================================================================");
		System.out.println(dust.color);
		System.out.println(dust.shape);
		System.out.println(dust.size);
		System.out.println(dust.weight);
		System.out.println(dust.height);
		System.out.println(dust.typeDry);
		System.out.println(dust.typeWet);
		System.out.println(dust.price);
		System.out.println(dust.uses);
		System.out.println("=================================================================");
		Dustbin dustbin= new Dustbin();
		System.out.println(dustbin.typeOfCan1);
		System.out.println(dustbin.typeOfCan2);
		System.out.println(dustbin.design);
		System.out.println(dustbin.difftypeOfContainers);
		System.out.println(dustbin.moveable);
		System.out.println("=================================================================");
	}
}
