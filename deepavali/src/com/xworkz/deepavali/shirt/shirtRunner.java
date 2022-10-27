package com.xworkz.deepavali.shirt;

import com.xworkz.deepavali.constant.shirtEnum;

public class shirtRunner {
	private static final String Awesome = "ShirtQuality";

	public static void main(String[] args) {
		
		shirtBrand prefer = new shirtBrand(Awesome, 150, 20,shirtEnum.ALLEN_SOLLY);
		prefer.ShowOff();
		
		shirtBrand.name="ALLEN_SOLLY";
		prefer.price=100;
		shirtBrand.name="Arun";
		prefer.quantity=200;
		prefer.setPrice(252);
		prefer.setTotalPrice();
		prefer.ShowOff();

	}


}
