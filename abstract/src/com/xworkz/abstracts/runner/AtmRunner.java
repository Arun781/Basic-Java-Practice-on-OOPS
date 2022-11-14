package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.child.AtmChild;
import com.xworkz.abstracts.parent.Atm;

public class AtmRunner {

	public static void main(String[] args) {
		Atm atm = new AtmChild();
		atm.checkbalance();
		atm.withdraw();

	}

}
