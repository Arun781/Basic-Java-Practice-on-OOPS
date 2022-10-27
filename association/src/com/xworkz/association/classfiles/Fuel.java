package com.xworkz.association.classfiles;

import com.xworkz.association.constant.FuelEnum;

//Fuel: brand:custom,special:true,type:enum,price,quantity
//showOff()-->brand.showOff
//totalPrice()
//showOff()
public class Fuel {
	public Brand brand = new Brand("Indian Oil", 251436652);
	public Location location = new Location(null);
	public FuelEnum fuelEnum = FuelEnum.Fuel_1;

	public Fuel(FuelEnum fuelEnum) {
		super();
		this.fuelEnum = fuelEnum;
	}
	public void totalPrice(FuelEnum fuelEnum) {
		System.out.println(this.fuelEnum);
	}
	public void ShowOff() {
		System.out.println(FuelEnum.Fuel_1.price);
		System.out.println(FuelEnum.Fuel_1.quantity);
	}

}
