package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalsRunner {

	public static void main(String[] args) {
		String animal1 = "Tiger";
		String animal2 = "Lion";
		String animal3 = "Liger";
		String animal4 = "Cat";
		String animal5 = "Dog";
		String animal6 = "Horse";
		String animal7 = "Cow";
		String animal8 = "Monkey";
		String animal9 = "Donkey";
		String animal10 = "Polar bear";

		Collection<String> animals = new ArrayList();
		animals.add(animal10);
		animals.add(animal9);
		animals.add(animal8);
		animals.add(animal7);
		animals.add(animal6);
		animals.add(animal5);
		animals.add(animal4);
		animals.add(animal3);
		animals.add(animal2);
		animals.add(animal1);
		
		System.err.println("___________________________________________________");
		System.out.println("The size of the Animal is:-" + animals.size());
		System.err.println("___________________________________________________");
		for (String ref : animals) {
			System.out.println("Declaring the all animals by using for loop:-" + ref);
		}
		System.err.println("__________________________________________________________");
		Iterator<String> animalslist = animals.iterator();
		while(animalslist.hasNext()) {
			String newref=animalslist.next();
			System.out.println("Declaring the all animals by using for Iterator:-"+newref);
		}

	}

}
