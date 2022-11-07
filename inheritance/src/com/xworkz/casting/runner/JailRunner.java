package com.xworkz.casting.runner;

import com.xworkz.casting.main.*;

public class JailRunner {

	public static void main(String[] args) {
		Jail jail=new CentralJail();
		System.out.println(jail.location);
		System.out.println(jail.name);
		CentralJail centraljail=(CentralJail)jail;
		System.out.println(centraljail.jailerName);
		System.out.println(centraljail.address);
		System.out.println("================================================================");
		
		Jail jail2=new SubJail();
		System.out.println(jail2.location);
		System.out.println(jail2.name);
		SubJail jail3=(SubJail)jail2;
		System.out.println(jail3.noOfSubJails);
		System.out.println(jail3.location);
		System.out.println("================================================================");
		
		Jail jail4=new WomenJail();
		System.out.println(jail4.location);
		System.out.println(jail4.name);
		WomenJail jail5=(WomenJail)jail4;
		System.out.println(jail5.jailCode);
		System.out.println(jail5.namesOfWomen);
		System.out.println("================================================================");

	}

}
