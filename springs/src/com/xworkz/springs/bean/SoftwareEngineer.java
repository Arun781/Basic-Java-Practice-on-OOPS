package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("SoftwareEngineerName")
	private String SoftwareEngineerName;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("salary")
	private double salary;
	@Autowired
	@Qualifier("experience")
	private double experience;

	public SoftwareEngineer() {
		System.out.println("Created SoftwareEngineer using no arg cons...");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [SoftwareEngineerName=" + SoftwareEngineerName + ", companyName=" + companyName
				+ ", salary=" + salary + ", experience=" + experience + "]";
	}

}
