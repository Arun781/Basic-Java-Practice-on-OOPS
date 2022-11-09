package com.xworkz.casting.main;

import com.xworkz.enums.Card;

public class Invitations {
	public double price;
	public int noOfCopies;
	public Card type;

	public Invitations() {
		System.out.println("Default Invitations constructor Created");
	}

	public Invitations(double price, int noOfCopies, Card type) {
		super();
		this.price = price;
		this.noOfCopies = noOfCopies;
		this.type = type;
	}
	public void showoff() {
		System.out.println(price);
		System.out.println(noOfCopies);
		System.out.println(type);
	}
}
