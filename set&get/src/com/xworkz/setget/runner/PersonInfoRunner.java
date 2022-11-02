package com.xworkz.setget.runner;

import com.xworkz.setget.classes.PersonInfo;
import com.xworkz.setget.classes.PersonInfoModify;

public class PersonInfoRunner {
	public static void main (String []arg) {
		PersonInfo personInfo = new PersonInfo();
		
		System.out.println(personInfo.getName());
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
		System.out.println("==============================");
		PersonInfoModify personInfoModify=new PersonInfoModify();
		personInfoModify.modifyingPersonINfo(personInfo);
	}
}
