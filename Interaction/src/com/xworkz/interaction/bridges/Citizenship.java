package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.TrafficRules;

 public class Citizenship implements  TrafficRules {
	public String wearHelmet() {
		 System.out.println("Wareing helmet is mandatory");
		return null;
	 }
	 public String tripleRiding() {
		 System.out.println("TripleRidig is the sign of breaking rules");
		 return null;
	 }
	 public String avoidDistractions() {
		 System.out.println("avoidDistractions");
		return null;
	 }
	 public String followTrafficSignals() {
		 System.out.println("followTrafficSignals");
		return null;
	 }
	 public int lightOfSignal() {
		System.out.println("There are three light signals :-" +3);
		return 0; 
	 }
	 public double fineIfBreaks() {
		 System.out.println("The fine for braking rules :-"+500);
		return 0; 
	 }
	 public boolean serviceYourCarRegularly() {
		 System.out.println("serviceYourCarRegularly is :-" + true);
		return false; 
	 }
}
