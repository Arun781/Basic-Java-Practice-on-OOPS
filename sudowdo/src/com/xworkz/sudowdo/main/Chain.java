package com.xworkz.sudowdo.main;

public class Chain {
	public String nameOfChain;
	public int price;
	public float length;
	public String material;
	public float weight;
	public boolean stolen;
	public String usedFor;
	public String freash;
	
	public Chain(String nameOfChain) {
		this.nameOfChain=nameOfChain;
		System.out.println("declaring the imformation of chain");
	}
	public Chain(String nameOfChain,int price) {
		this(nameOfChain);
		this.price=price;
		System.out.println("declaring the imformation of price");
	}
	public Chain(String nameOfChain,int price,float length) {
		this(nameOfChain,price);
		this.length=length;
		System.out.println("declaring the imformation of length");
	}
	public Chain(String nameOfChain,int price,float length,String material) {
		this(nameOfChain,price,length);
		this.material=material;
		System.out.println("declaring the imformation of material");
	}
	public Chain(String nameOfChain,int price,float length,String material,float weight) {
		this(nameOfChain,price,length,material);
		this.weight=weight;
		System.out.println("declaring the imformation of weight");
	}
	public Chain(String nameOfChain,int price,float length,String material,float weight,boolean stolen) {
		this(nameOfChain,price,length,material,weight);
		this.stolen=stolen;
		System.out.println("declaring the imformation of stolen");
	}
	public Chain(String nameOfChain,int price,float length,String material,float weight,boolean stolen,String usedFor) {
		this(nameOfChain,price,length,material,weight,stolen);
		this.usedFor=usedFor;
		System.out.println("declaring the imformation of usedFor");
	}
	public Chain(String nameOfChain,int price,float length,String material,float weight,boolean stolen,String usedFor,String freash) {
		this(nameOfChain,price,length,material,weight,stolen,usedFor);
		this.freash=freash;
		System.out.println("declaring the imformation of freash");
	}
}
