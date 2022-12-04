package com.xworkz.interaction.rules;
public class ReserveBankIndia {
	private YesBank banks;
	public ReserveBankIndia() {
		System.out.println("Running the Default Constructor");
	}
	public ReserveBankIndia(YesBank banks) {
		this.banks=banks;
		System.out.println("Running the Parametreized Constructor");
	}
	public void checkBank() {
		System.out.println("Running the CheckBank");
		if(banks!=null) {
			long maxamount =this.banks.maxAmount();
			double minamount =this.banks.minAmount();
			if(maxamount==25000 && minamount==10000) {
				System.out.println("The Bank Manager Following the Rules");
			}
			else {
				System.out.println("The Bank Manager not Following the Rules");
			}
		}
	}
}
