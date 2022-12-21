package com.xworkz.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class WatchesRunner {

	public static void main(String[] args) {
		Double costOfTitan=2500D;
		Double costOfFastrack=3500D;
		Double costOfNoise=4500D;
		Double costOfBoat=2500D;
		Double costOfRolex=25500D;
		Double costOfApple=75000D;
		
		Collection<Double> wathes = new TreeSet<Double>();
		
		wathes.add(costOfTitan);
		wathes.add(costOfFastrack);
		wathes.add(costOfNoise);
		wathes.add(costOfRolex);
		wathes.add(costOfApple);
		wathes.add(costOfBoat);
		
		System.err.println("___________________________________________________");
		System.out.println("The size of the wathes is:-" + wathes.size());
		System.err.println("___________________________________________________");
		for (Double ref : wathes) {
			System.out.println("Declaring the all wathes by using for loop:-" + ref);
		}
		System.err.println("__________________________________________________________");
		Iterator<Double> animalslist = wathes.iterator();
		while(animalslist.hasNext()) {
			Double newref=animalslist.next();
			System.out.println("Declaring the all wathes by using for Iterator:-"+newref);
		}
	}

}
