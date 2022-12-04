package com.xworkz.interaction.runner;

import com.xworkz.interaction.rules.ReserveBankIndia;
import com.xworkz.interaction.rules.YesBank;

public class ReserveBankIndiaRunner {

	public static void main(String[] args) {
		YesBank yesBank = new YesBank();
		ReserveBankIndia reserveBankIndia = new ReserveBankIndia(yesBank);
		reserveBankIndia.checkBank();
	}

}
