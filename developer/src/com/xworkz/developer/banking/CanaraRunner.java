package com.xworkz.developer.banking;

import com.xworkz.developer.constant.CanaraBank;

public class CanaraRunner {

	public static void main(String[] args) {
		Canara prefer = new Canara("B.V.ArunKumar", 9620753670l, "Bannikal", "Viajayanagr", 25425,
				CanaraBank.BALANCE_1);
		prefer.disposeUr();
	}

}
