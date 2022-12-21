package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TechCompaniesNameRunner {

	public static void main(String[] args) {
		String tech1 ="Wipro";
		String tech2 ="Infosys";
		String tech3 ="TCS";
		String tech4 ="TATA";
		String tech5 ="X-workz";
		String tech6 ="Benz";
		String tech7 ="Titan";
		String tech8 ="Acuvate";
		String tech9 ="Acuvar";
		String tech10 ="Infotech";
		String tech11 ="Infozen";
		String tech12 ="Byzus";
		String tech13 ="IBM";
		String tech14 ="Microsoft";
		String tech15 ="Apple";
		String tech16 ="Cisco";
		String tech17 ="Dell";
		String tech18 ="Lenovo";
		String tech19 ="HP";
		String tech20 ="Accenture";
		
		Collection<String> techCompanies = new ArrayList();
		
		techCompanies.add(tech1);
		techCompanies.add(tech2);
		techCompanies.add(tech3);
		techCompanies.add(tech4);
		techCompanies.add(tech5);
		techCompanies.add(tech6);
		techCompanies.add(tech7);
		techCompanies.add(tech8);
		techCompanies.add(tech9);
		techCompanies.add(tech10);
		techCompanies.add(tech11);
		techCompanies.add(tech12);
		techCompanies.add(tech13);
		techCompanies.add(tech14);
		techCompanies.add(tech15);
		techCompanies.add(tech16);
		techCompanies.add(tech17);
		techCompanies.add(tech18);
		techCompanies.add(tech19);
		techCompanies.add(tech20);
		
		System.err.println("___________________________________________________");
		System.out.println("The size of the techCompanies is:-" + techCompanies.size());
		System.err.println("___________________________________________________");
		for (String ref : techCompanies) {
			System.out.println("Declaring the all animals by using for loop:-" + techCompanies);
		}
		System.err.println("__________________________________________________________");
		Iterator<String> techCompanieslist = techCompanies.iterator();
		while(techCompanieslist.hasNext()) {
			String newref=techCompanieslist.next();
			System.out.println("Declaring the all techCompanies by using for Iterator:-"+newref);
		}
	}

}
