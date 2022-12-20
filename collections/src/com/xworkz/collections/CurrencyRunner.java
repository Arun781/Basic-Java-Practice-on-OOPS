package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CurrencyRunner {

	public static void main(String[] args) {
		String currency1="Afghanistan is Afghani ";
		String currency2="Albania is Lek";
		String currency3="Algeria is Dinar";
		String currency4="Andorra is Euro";
		String currency5="Angola is New Kwanza";
		String currency6="Argentina is Peso";
		String currency7="Armenia is Dram";
		String currency8="Australia is Australian dollar";
		String currency9="Austria is Currently: Euro, Previously: Schilling";
		String currency10="Azerbaijan is Manat";
		String currency11="Bahamas is Bahamian dollar ";
		String currency12="Bangladeshis Taka";
		String currency13="Belgium is Currently: Euro, Previously: Belgian franc";
		String currency14="Brazil is Real";
		String currency15="China is chinese Yuan";
		String currency16="Colombia is Colombian Peso";
		String currency17="Zimbabwe is"+ "United States Dollar";
		String currency18="Egypt is Egyptian pound";
		String currency19="Germany is Present: Euro, Previously: Deutsche Mark";
		String currency20="India is Indian Rupee";
		String currency21="Israel is Shekel";
		String currency22="Japan is Yen";
		String currency23="Italy is Euro, Previously: Lira";
		String currency24="Iraq is Iraqi Dinar";
		String currency25="Kuwait is Kuwaiti Dinar";
		String currency26="South Korea is South Korean Won";
		
		Collection<String> collection = new ArrayList();
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		collection.add(currency11);
		collection.add(currency12);
		collection.add(currency13);
		collection.add(currency14);
		collection.add(currency15);
		collection.add(currency16);
		collection.add(currency17);
		collection.add(currency18);
		collection.add(currency19);
		collection.add(currency20);
		collection.add(currency21);
		collection.add(currency22);
		collection.add(currency23);
		collection.add(currency24);
		collection.add(currency25);
		collection.add(currency26);
		System.out.println(collection.size());
		collection.clear();
		System.out.println("After clearing"+collection);
		System.out.println(collection.size());
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		System.out.println("After adding again"+collection);
		
	}

}
