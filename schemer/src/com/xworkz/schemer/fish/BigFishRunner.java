package com.xworkz.schemer.fish;

public class BigFishRunner 
{
	public static void main(String[] args) 
	{
		BigFish ref = new BigFish();
		ref.name="Gold Fish";
		ref.type="Comet";
		ref.price=250;
		ref.weight=5.0;
		ref.length=25f;
		System.out.println(ref.length);
		System.out.println(ref.name);
		System.out.println(ref.price);
		System.out.println(ref.weight);
		System.out.println(ref.type);
		/*type name = new type();*/
		BigFish ref1 = new BigFish("arun","arun");
		System.out.println(ref1.length);
		System.out.println(ref1.name);
		System.out.println(ref1.price);
		System.out.println(ref1.weight);
		System.out.println(ref1.type);
		BigFish ref2 = new BigFish(25);
		System.out.println(ref2.length);
		System.out.println(ref2.name);
		System.out.println(ref2.price);
		System.out.println(ref2.weight);
		System.out.println(ref2.type);
		BigFish ref3 = new BigFish(2.0d);
		System.out.println(ref3.length);
		System.out.println(ref3.name);
		System.out.println(ref3.price);
		System.out.println(ref3.weight);
		System.out.println(ref3.type);
		BigFish ref4 = new BigFish(5.0f);
		System.out.println(ref4.length);
		System.out.println(ref4.name);
		System.out.println(ref4.price);
		System.out.println(ref4.weight);
		System.out.println(ref4.type);	
	}
}
