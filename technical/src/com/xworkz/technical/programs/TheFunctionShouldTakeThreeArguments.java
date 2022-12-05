package com.xworkz.technical.programs;

public class TheFunctionShouldTakeThreeArguments {
	 public String name;
	 public int age;
	 public char gender;
	 public TheFunctionShouldTakeThreeArguments() {
		System.out.println("running the default constructor");
	}

	public TheFunctionShouldTakeThreeArguments(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
	public static void main (String [] arg) {
		TheFunctionShouldTakeThreeArguments ref = new TheFunctionShouldTakeThreeArguments("Arun",25,'M');
		ref.display();
	}
	 
}

	


