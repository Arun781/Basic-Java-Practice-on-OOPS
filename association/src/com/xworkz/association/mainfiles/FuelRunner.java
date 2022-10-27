package com.xworkz.association.mainfiles;

import com.xworkz.association.classfiles.Fuel;
import com.xworkz.association.constant.FuelEnum;

public class FuelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fuel prefer = new Fuel(FuelEnum.Fuel_1);
		
		prefer.location.name="Madhapur";
		prefer.brand.gstNum=5426324;
		prefer.brand.name="Bharat";
		prefer.totalPrice(null);
		prefer.ShowOff();
	}

}
