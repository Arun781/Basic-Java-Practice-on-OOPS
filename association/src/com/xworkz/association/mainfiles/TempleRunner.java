package com.xworkz.association.mainfiles;

import com.xworkz.association.classfiles.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple = new Temple("Hanuman Temple", "All is well");
		temple.ShowOff();
		System.out.println(temple.god.mainPower="EveryThing Can Do");
		System.out.println(temple.god.gender='m');
		System.out.println(temple.god.weapon="gada");
		System.out.println(temple.god.name="Hanuman");
		temple.god("Shiva");
		temple.collectionPerDay(60000);
		temple.noOfVisitor(400);
		temple.ShowOff();
	}

}
