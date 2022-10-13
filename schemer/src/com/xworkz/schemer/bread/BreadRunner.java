package com.xworkz.schemer.bread;

public class BreadRunner {

	public static void main(String[] args)
	{
		Bread withRespectTo= new Bread("","");
		withRespectTo.companyName="lava";
		withRespectTo.price=50;
		withRespectTo.shape="BOX";
		withRespectTo.type='S';
		withRespectTo.quantity=5.0;
		System.out.println(withRespectTo.companyName);
		System.out.println(withRespectTo.price);
		System.out.println(withRespectTo.shape);
		System.out.println(withRespectTo.type);
		System.out.println(withRespectTo.quantity);
		Bread withRespectTo1= new Bread(50, 5.5, 'H');
		System.out.println(withRespectTo1.companyName);
		System.out.println(withRespectTo1.price);
		System.out.println(withRespectTo1.shape);
		System.out.println(withRespectTo1.type);
		System.out.println(withRespectTo1.quantity);
		
		
	}

}
