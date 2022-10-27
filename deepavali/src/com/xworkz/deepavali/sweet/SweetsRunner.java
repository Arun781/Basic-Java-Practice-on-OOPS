package com.xworkz.deepavali.sweet;

import com.xworkz.deepavali.constant.SweetStall;

public class SweetsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sweets prefer = new Sweets(Sweets.name,SweetStall.Bangalore,150,250);
		prefer.ShowOff();
		Sweets.name="Shashi";
		prefer.location= SweetStall.Hyderbad;
		prefer.price=100;
		prefer.quantity=200;
		prefer.setPrice(252);
		prefer.setTotalPrice();
		prefer.ShowOff();

	}
}
