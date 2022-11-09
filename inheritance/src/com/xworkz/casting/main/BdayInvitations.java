package com.xworkz.casting.main;

import com.xworkz.enums.Card;

public class BdayInvitations extends Invitations {
	public String name="Vaishank";
	public BdayInvitations() {
		System.out.println("Default BdayInvitations constructor Created");
	}
	public BdayInvitations(double price, int noOfCopies, Card type) {
		super(price, noOfCopies, type);
	}
}
