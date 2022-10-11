package com.xworkz.bigfish.software;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Declaring the nameOfDeveloper,educationOfDeveloper,experienceOfDeveloper,salaryOfDeveloper,companyOfDeveloper");
		Developer codingGuy = new Developer();
		System.out.println(codingGuy.companyOfDeveloper);
		System.out.println(codingGuy.educationOfDeveloper);
		System.out.println(codingGuy.experienceOfDeveloper);
		System.out.println(codingGuy.nameOfDeveloper);
		System.out.println(codingGuy.salaryOfDeveloper);
		codingGuy.companyOfDeveloper= "X-workz";
		codingGuy.educationOfDeveloper = "Bachelor of Engineering";
		codingGuy.experienceOfDeveloper=5;
		codingGuy.nameOfDeveloper="Introvert";
		codingGuy.salaryOfDeveloper=50000;
		System.out.println(codingGuy.companyOfDeveloper);
		System.out.println(codingGuy.educationOfDeveloper);
		System.out.println(codingGuy.experienceOfDeveloper);
		System.out.println(codingGuy.nameOfDeveloper);
		System.out.println(codingGuy.salaryOfDeveloper);
	
	}

}
