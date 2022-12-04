package com.xworkz.interaction.rules;

public class Staff {
	private AirportFollows airportFollows;
	public Staff() {
		System.out.println("Running the AirportFollows constructor");
	}
	public Staff(AirportFollows airportFollows) {
		this.airportFollows=airportFollows;
		System.out.println("Running the parameterized AirportFollows constructor");
	}
	
	public void airportFollowsChecks() {
		if(airportFollows != null) {
			double price = this.airportFollows.price();
			float timing = this.airportFollows.timing();
			if(price==1 && timing==1.0) {
				System.out.println("The Staff following the Rules");
			}
			else {
				System.out.println("The Staff is not following the Rules");
			}
		}
	}
}
