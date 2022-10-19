package com.xworkz.view.tired;

public class Sambar {
	public String name;
	public boolean veg;
	public String[] color;
	public int quantity;
	public String[] ingredients;
	
	public Sambar(String name,boolean type,String[] color,int quantity,String[] ingredients ) {
		this.name=name;
		this.veg=type;
		this.quantity=quantity;
		this.color=color;
		this.ingredients=ingredients;
		System.out.println("sambar construtor with 5 argument");
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.veg);
		System.out.println(this.quantity);
		System.out.println(this.color);
		
		
		for(int i=0;i<color.length;i++) {
			String string=color[i];
			System.out.println(string);
		}
		System.out.println(this.ingredients);
		for(int i=0;i<this.ingredients.length;i++) {
			String string=ingredients[i];
			System.out.println(string);
		}
		
	}
}