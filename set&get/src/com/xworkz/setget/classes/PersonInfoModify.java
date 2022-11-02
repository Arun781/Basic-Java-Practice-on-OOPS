package com.xworkz.setget.classes;

public class PersonInfoModify {
public void modifyingPersonINfo(PersonInfo personInfo) {
	personInfo.setName(null);
	personInfo.setQualification(null);
	personInfo.setNameOfBrother(null);
	personInfo.setNameOfFather(null);
	personInfo.setNameOfMather(null);
	personInfo.setPlace(null);
	personInfo.setAgeOfBrother(0);
	personInfo.setAgeOfFather(0);
	personInfo.setAgeOfMother(0);
	personInfo.setNum(0);
	personInfo.setAddarNum(0);
	
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
