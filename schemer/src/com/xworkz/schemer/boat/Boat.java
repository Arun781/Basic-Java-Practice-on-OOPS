package com.xworkz.schemer.boat;

public class Boat
{
	public String name;
	public String color;
	public String companyName;
	public char type;
	public String owner;
	
	public Boat(String name, String color)
	{
		this.name=name;
		this.color=color;
	}
	public Boat(String companyName,char type)
	{
		this.companyName=companyName;
		this.type=type;
	}
	public Boat(String owner)
	{
		this.owner=owner;
    }
}
