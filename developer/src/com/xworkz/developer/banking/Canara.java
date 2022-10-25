package com.xworkz.developer.banking;

import com.xworkz.developer.constant.CanaraBank;

public class Canara {
	public String nameOfCustomer;
	public long customerNumber;
	public String place;
	public String dist;
	public double balance;
	public CanaraBank canaraBank = CanaraBank.BALANCE_1;
	
	
	public Canara(String nameOfCustomer, long customerNumber, String place, String dist, double balance,
			CanaraBank canaraBanks) {
		super();
		this.nameOfCustomer = nameOfCustomer;
		this.customerNumber = customerNumber;
		this.place = place;
		this.dist = dist;
		this.balance = balance;
		this.canaraBank = canaraBanks;
	}
	public void disposeUr() {
		System.out.println(this.nameOfCustomer);
		System.out.println(this.customerNumber);
		System.out.println(this.place);
		System.out.println(this.dist);
		System.out.println(this.balance);
		System.out.println(CanaraBank.BALANCE_1.savingBalance);
		System.out.println(CanaraBank.BALANCE_1.currentBalance);
		System.out.println(CanaraBank.BALANCE_1.personalBalance);
	}

}
