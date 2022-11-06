package com.xworkz.setget.classes;

public class PersonInfoModify {
public void modifyingPersonINfo(PersonInfo personInfo) {
	personInfo.setName("Shrisham");
	personInfo.setQualification("BE 98.7%");
	personInfo.setNameOfBrother("null");
	personInfo.setNameOfFather("Prakash");
	personInfo.setNameOfMather("Sangeetha");
	personInfo.setPlace("Sappegattey");
	personInfo.setAgeOfBrother(0);
	personInfo.setAgeOfFather(54);
	personInfo.setAgeOfMother(45);
	personInfo.setNum(8277738399l);
	personInfo.setAddarNum(577452l);
	
	System.out.println(	personInfo.getName());
	System.out.println(	personInfo.getNameOfBrother());
	System.out.println(	personInfo.getNameOfFather());
	System.out.println(	personInfo.getNameOfMather());
	System.out.println(	personInfo.getAgeOfBrother());
	System.out.println(	personInfo.getAgeOfFather());
	System.out.println(	personInfo.getAgeOfMother());
	System.out.println(	personInfo.getPlace());
	System.out.println(	personInfo.getNum());
	System.out.println(	personInfo.getAddarNum());
	System.out.println(	personInfo.getQualification());
	
}
}
