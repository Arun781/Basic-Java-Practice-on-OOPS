package com.xworkz.view.automobile;

public class TravelingRunner {

	public static void main(String[] args) {
		String [] boardingPoint = {"Madhapur","BalaNagar","GAcchbowli"};
		String [] departurespooint = {"BusStand","StationRoad"};
		String [] pricesOfBus = {"Hampi","TB DAM","BAck lakhe"};
		String [] stufs = {"Gobi","Chicken","Vaggarani Mirchi",};
		String [] seats = {"AC","3A","2A","Sleeper"};
		
		Traveling ref = new Traveling("Hyd","Hospet",350,"Bus",60,boardingPoint,departurespooint,pricesOfBus,stufs,seats);
		ref.display();
	}

}
