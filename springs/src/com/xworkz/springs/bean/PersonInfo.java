package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonInfo {
	@Autowired
	@Qualifier("personName")
	private String personName;
	@Autowired
	@Qualifier("personage")
	private int personage;
	@Autowired
	@Qualifier("personheight")
	private short personheight;
	@Autowired
	@Qualifier("personcellNum")
	private long personcellNum;
	@Autowired
	@Qualifier("personweight")
	private float personweight;
	@Autowired
	@Qualifier("personsalary")
	private double personsalary;
	@Autowired
	@Qualifier("personalive")
	private boolean personalive;
	@Autowired
	@Qualifier("persongender")
	private char persongender;
	@Autowired
	@Qualifier("personbirthDate")
	private byte personbirthDate;
	
	@Override
	public String toString() {
		return "PersonInfo [personName=" + personName + ", personage=" + personage + ", personheight=" + personheight
				+ ", personcellNum=" + personcellNum + ", personweight=" + personweight + ", personsalary="
				+ personsalary + ", personalive=" + personalive + ", persongender=" + persongender
				+ ", personbirthDate=" + personbirthDate + "]";
	}

	public PersonInfo() {
		System.out.println("Running the PersonInfo no arg const");
	}

	

}
