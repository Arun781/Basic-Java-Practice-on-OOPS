package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSizeRunner {

	public static void main(String[] args) {
		int shoe1 = 1;
		int shoe2 = 2;
		int shoe3 = 3;
		int shoe4 = 4;
		int shoe5 = 5;
		int shoe6 = 6;
		int shoe7 = 7;
		int shoe8 = 8;
		int shoe9 = 9;
		int shoe10 = 10;
		int shoe11 = 11;
		int shoe13 = 12;
		int shoe12 = 13;
		int shoe14 = 14;
		int shoe15 = 15;
	
		Collection<Integer> sizes = new ArrayList();
		
		sizes.add(shoe1);
		sizes.add(shoe2);
		sizes.add(shoe3);
		sizes.add(shoe4);
		sizes.add(shoe5);
		sizes.add(shoe6);
		sizes.add(shoe7);
		sizes.add(shoe8);
		sizes.add(shoe9);
		sizes.add(shoe10);
		sizes.add(shoe11);
		sizes.add(shoe12);
		sizes.add(shoe13);
		sizes.add(shoe14);
		sizes.add(shoe15);
		
		System.err.println("___________________________________________________");
		System.out.println("The size of the wathes is:-" + sizes.size());
		System.err.println("___________________________________________________");
		for (Integer ref : sizes) {
			System.out.println("Declaring the all wathes by using for loop:-" + ref);
		}
		System.err.println("__________________________________________________________");
		Iterator<Integer> animalslist = sizes.iterator();
		while(animalslist.hasNext()) {
			Integer newref=animalslist.next();
			System.out.println("Declaring the all wathes by using for Iterator:-"+newref);
		}
		
		
	}

}
