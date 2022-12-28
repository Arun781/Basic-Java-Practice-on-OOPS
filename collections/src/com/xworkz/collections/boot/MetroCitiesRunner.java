package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCitiesRunner {

	public static void main(String[] args) {

		String metroCitie1 = "Bangaloure";
		String metroCitie2 = "Hyderbad";
		String metroCitie3 = "Mumbai";
		String metroCitie4 = "Kolkatta";
		String metroCitie5 = "Delhi";
		
		Collection<String> metroCities= new ArrayList();
		
		metroCities.add(metroCitie1);
		metroCities.add(metroCitie2);
		metroCities.add(metroCitie3);
		metroCities.add(metroCitie4);
		metroCities.add(metroCitie5);
		
		System.err.println("___________________________________________________");
		System.out.println("The metroCities of the size is:-" + metroCities.size());
		System.err.println("___________________________________________________");
		for (String ref : metroCities) {
			System.out.println("Declaring the all metroCities by using for loop:-" + ref);
		}
		System.err.println("__________________________________________________________");
		Iterator<String> animalslist = metroCities.iterator();
		while(animalslist.hasNext()) {
			String newref=animalslist.next();
			System.out.println("Declaring the all metroCities by using for Iterator:-"+newref);
		}

	}

}








































