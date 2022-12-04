package com.xworkz.interaction.runner;

import com.xworkz.interaction.rules.AirportFollows;
import com.xworkz.interaction.rules.Staff;

public class AirportRunner {

	public static void main(String[] args) {
		AirportFollows airportFollows = new AirportFollows();
		Staff staff = new Staff(airportFollows);
		staff.airportFollowsChecks();
	}

}
