package com.xworkz.association.constant;

public enum FuelEnum {
	Fuel_1(120,1.0f);
	public int price;
	public float quantity;
	private FuelEnum (int price,float quantity) {
		this.price=price;
		this.quantity=quantity;
	}
	
}
