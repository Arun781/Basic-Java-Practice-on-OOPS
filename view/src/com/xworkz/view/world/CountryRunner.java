package com.xworkz.view.world;

import com.xworkz.view.constant.Limits;

public class CountryRunner {

	public static void main(String[] args) {
		String [] states = {"KA","TA","TP","AP","MH","MP","ETC"};
		String [] namesOfPM = {"Neharu","Manmohan Singh","Indira Gandi"};
		String [] lanaguages = {"Hindi","Kannada","Telugu","English"};
		String [] seas = {"Narmada","Ganga","Godavari","Kaveri"};
		
		Country prefers = new Country("India","Delhi",1388547965,
				"rupee","For Every Thing",Limits.Addar_Num,Limits.Driving_licence,
				states,namesOfPM,lanaguages,seas);
		
		prefers.display();
	}

}
