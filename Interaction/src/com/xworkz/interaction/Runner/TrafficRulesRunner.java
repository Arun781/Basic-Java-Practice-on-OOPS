package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.Citizenship;
import com.xworkz.interaction.rules.TrafficRules;

public class TrafficRulesRunner {
	public static void main(String[] args) {
		TrafficRules obj = new Citizenship();
		obj.wearHelmet();
		obj.tripleRiding();
		obj.avoidDistractions();
		obj.followTrafficSignals();
		obj.lightOfSignal();
		obj.lightOfSignal();
		obj.fineIfBreaks();
		obj.serviceYourCarRegularly();
		System.out.println("_____________________________________________");
		Citizenship obj1 = new Citizenship();
		obj1.wearHelmet();
		obj1.tripleRiding();
		obj1.avoidDistractions();
		obj1.followTrafficSignals();
		obj1.lightOfSignal();
		obj1.lightOfSignal();
		obj1.fineIfBreaks();
		obj1.serviceYourCarRegularly();
		
	}
}
