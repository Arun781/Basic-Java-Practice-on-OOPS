package com.xworkz.interaction.rules;

public class Driver {
	private Passenger passengerRef;
	public Driver() {
		System.out.println("Running the Passenger constructor");
	}
	public Driver(Passenger passengerRef){
		this.passengerRef=passengerRef;
		System.out.println("Running the parametrized constructor");
	}
	
	public void checkPassenger() {
		System.out.println("Runninng the checkPassenger");
		if(passengerRef != null) {
			boolean wearMask = this.passengerRef.wearMask();
			double ticketPrice = this.passengerRef.ticketPrice();
			if(wearMask==true && ticketPrice==25) {
				System.out.println("The Passenger is wared Mask And took Ticket");
			}
			else {
				System.out.println("The Passenger is not wared Mask And took Ticket");
			}
		}
	}
	
	
	
}
