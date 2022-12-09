package com.xworkz.technical.programs;

public class Pen {

	public void method1()
	{
		this.method2();
		System.out.println("Running method1");
//		throw new NullPointerException();
	}
	public void method2()
	{
		method3();
		System.out.println("Running method2");
//		throw new NullPointerException();
	}
	public void method3()
	{
		method4();
		System.out.println("Running method3");
//		throw new NullPointerException();
	}
	public void method4()
	{
		method5();
		System.out.println("Running method4");
//		throw new NullPointerException();
	}
	public void method5() throws NullPointerException
	{
		
		System.out.println("Running method5");
		throw new ArrayIndexOutOfBoundsException();
	}
}
