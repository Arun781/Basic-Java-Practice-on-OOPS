package com.xworkz.abstracts.child;

import com.xworkz.abstracts.parent.Atm;

public class AtmChild extends Atm {
	@Override
	public void withdraw() {
		System.out.println("Printing the withdraw without body using abstarct methos");
	}
	public void checkbalance() {
		System.out.println("Printing the check balance");
	}

}
