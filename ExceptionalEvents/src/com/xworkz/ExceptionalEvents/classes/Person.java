package com.xworkz.ExceptionalEvents.classes;

public abstract class Person {
	protected String name;
	private int age;
	private int weight;
	private float height;
	private String place;
	
	abstract String eat();
	abstract boolean sleep();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void showOff() {
		System.out.println(this.age);
		
	}
	
}
