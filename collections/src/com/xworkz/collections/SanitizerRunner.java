package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO sanitizerDT1 = new SanitizerDTO("Himalaya", "Neem", "Himalaya", "JP Ngar Bang", "Shuhan", 520D,
				true, true, "Neam", 500, "Blue");
		SanitizerDTO sanitizerDT2 = new SanitizerDTO("Purell", "cleaner", "Purrel", "JayaNagar Bang", "Arun", 452D,
				true, true, "Strawberry", 650, "Black");
		SanitizerDTO sanitizerDT3 = new SanitizerDTO("Dettol", "clarifier", "Dettol", "National College Bang", "Varun",
				400D, true, true, "Menthol", 700, "Green");
		SanitizerDTO sanitizerDT4 = new SanitizerDTO(null, "cleanser", "Lifeboy", "Madhapur Hud", "Shivu", 550D, true,
				true, "Cherry", 480, "Yellow");
		SanitizerDTO sanitizerDT5 = new SanitizerDTO("Higenix", "decontaminant", "prel", "Gacchibowli Hyd", "Shreyan",
				650D, true, true, "Peach", 655, "Green");
		SanitizerDTO sanitizerDT6 = new SanitizerDTO("Purell", "deodorizer", "Nivia", "Srirampur", "Sachine", 780D,
				true, true, "Menthol", 554, "Yellow");
		SanitizerDTO sanitizerDT7 = new SanitizerDTO("Nyle", null, "Nyle", "Chikkpet Bang", "Sunil", 2140D, true, true,
				"Tropical", 659, "Orange");
		SanitizerDTO sanitizerDT8 = new SanitizerDTO("MegaBabe", "detergent", "Megeteria", "BTM Bang", "Shashank", 980D,
				true, true, "Berry", 799, "White");
		SanitizerDTO sanitizerDT9 = new SanitizerDTO("Bare Hands", "disinfectant", null, "Mysore", "Chethan", 550D,
				true, true, "Cherry", 699, "Red");
		SanitizerDTO sanitizerDT1O = new SanitizerDTO("Liveasy", "filter", "Levisiya", "Vijayanagar", null, 1120D, true,
				true, null, 599, "Red");
		System.out
				.println("==========================================================================================");

		Collection<SanitizerDTO> Sanitizers = new ArrayList<SanitizerDTO>();
		Sanitizers.add(sanitizerDT1O);
		Sanitizers.add(sanitizerDT9);
		Sanitizers.add(sanitizerDT8);
		Sanitizers.add(sanitizerDT8);
		Sanitizers.add(sanitizerDT7);
		Sanitizers.add(sanitizerDT6);
		Sanitizers.add(sanitizerDT5);
		Sanitizers.add(sanitizerDT4);
		Sanitizers.add(sanitizerDT3);
		Sanitizers.add(sanitizerDT2);
		Sanitizers.add(sanitizerDT1);

		System.out.println(System.lineSeparator());
		System.out.println("=====Printing the null values of SanitizerDTO:- ");
		Iterator<SanitizerDTO> showSan = Sanitizers.iterator();
		while (showSan.hasNext()) {
			SanitizerDTO ref = showSan.next();
			if (ref.getColur() == null || ref.getBrand() == null || ref.getName() == null || ref.getCompany() == null
					|| ref.getLocation() == null || ref.getOwner() == null || ref.getFlavour() == null) {
				System.out.println("Pringting the null values:-->" + ref);
			}
		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> showSan1 = Sanitizers.iterator();
		System.out.println("The size of the Sanitizers "
				+ " removing the colurs:->" + Sanitizers.size());
		while (showSan1.hasNext()) {
			SanitizerDTO ref1 = showSan1.next();
			if (ref1.getColur() == "Black" || ref1.getColur() == "Red") {
				// System.out.println("Removing the Red and Black Colur from ShowSan:-" + ref1);
				showSan1.remove();
				// System.out.println("After Removing the Red and Black Colur from
				// ShowSan:-"+ref1);
			}
		}
		System.out.println("The size of the Sanitizers After removing the colurs:->" + Sanitizers.size());

		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> showSan3 = Sanitizers.iterator();
		while (showSan3.hasNext()) {
			SanitizerDTO price = showSan3.next();
			if (price.getPrice() >= 1500) {
				System.out.println("The printing the greter than 1500 rupees:- " + price);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> showSan4 = Sanitizers.iterator();
		while (showSan4.hasNext()) {
			SanitizerDTO price1 = showSan4.next();
			if (price1.getPrice() <= 500) {
				System.out.println("The printing the lesser thean 1500 values:- " + price1);
			}
		}
	}
}
