package com.xworkz.interaction.runner;

import com.xworkz.interaction.rules.HospitalManagement;
import com.xworkz.interaction.rules.Visitors;

public class HospitalManagementRunner {

	public static void main(String[] args) {
		Visitors visitors = new Visitors();
		HospitalManagement hospitalManagement = new HospitalManagement(visitors);
		hospitalManagement.checkVisitor();

	}

}
