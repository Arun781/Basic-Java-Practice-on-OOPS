package com.xworkz.deepavali.shirt;

import com.xworkz.deepavali.constant.shirtEnum;
public class shirtRunner {
	public static void main(String[] args) {
		
		shirtBrand prefer = new shirtBrand(shirtEnum.RAYMOND, 150, 250);
		prefer.ShowOff();
		
		shirtBrand.name="ALLEN_SOLLY";
		prefer.price=100;
		prefer.name="Arun";
		prefer.quantity=200;
		prefer.setPrice(252);
		prefer.setTotalPrice();
		prefer.ShowOff();

	}


}
