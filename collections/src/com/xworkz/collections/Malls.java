package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;

public class Malls {

	public static void main(String[] args) {
		String mall1="Orion";
		String mall2="U_mal";
		String mall3="LuLu mall";
		String mall4="PVR_ICON";
		String mall5="High_Tech";
		String mall6="Metro mal";
		String mall7="HyperCity";
		String mall8="Sarath City Capital Mall";
		String mall9="Lulu Mall Thiruvananthapuram";
		String mall10="DLF Mall of India";
		String mall11="Ambience Mall Gurgaon";
		String mall12="DB City Mall, Bhopal";
		String mall13="Nexus Ahmedabad One";
		String mall14="Amanora Mall, Magarpatta, Hadapsar";
		String mall15="Ambience Mall, Vasant Kunj";
		String mall16="R City Mall";
		String mall17="Forum";
		String mall18="Elante Mall";
		String mall19="Magneto the mall";
		String mall20="The Great India Place";
		String mall21="Mantri Square";
		String mall22="Phoenix Marketcity (Bangalore)";
		String mall23="Viviana Mall";
		String mall24="Nexus Sujana Mall";
		String mall25="Inorbit Mall, Cyberabad";
		String mall26="Royal Meenakshi Mall";
		String mall27="Nexus Shantiniketan";
		String mall28="DLF Avenue (Formerly DLF Place)";
		String mall29="MGF Metropolitan Mall, Gurgaon";
		String mall30="Inorbit Mall, Malad";
		String mall31="Prozone Mall (Coimbatore)";
		String mall32="Lodha Xperia Mall";
		String mall33="Unity One, Janakpuri";
		String mall34="MSX Mall";
		String mall35="City Centre, Siliguri";
		String mall36="City Mall";
		String mall37="Axis Mall";
		String mall38="City Centre, New Town (City Centre 2)";
		String mall39="Crown Interiorz Mall";
		String mall40="Pacific Mall, Ghaziabad";
		
		Collection collection = new HashSet();
		
		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);
		collection.add(mall11);
		collection.add(mall12);
		collection.add(mall13);
		collection.add(mall14);
		collection.add(mall15);
		collection.add(mall16);
		collection.add(mall17);
		collection.add(mall18);
		collection.add(mall19);
		collection.add(mall20);
		collection.add(mall21);
		collection.add(mall22);
		collection.add(mall23);
		collection.add(mall24);
		collection.add(mall25);
		collection.add(mall26);
		collection.add(mall27);
		collection.add(mall28);
		collection.add(mall29);
		collection.add(mall30);
		collection.add(mall31);
		collection.add(mall32);
		collection.add(mall33);
		collection.add(mall34);
		collection.add(mall35);
		collection.add(mall36);
		collection.add(mall37);
		collection.add(mall38);
		collection.add(mall39);
		collection.add(mall40);
		
		
		System.out.println("The Size of mall is :-"+collection.size());
		collection.clear();
		System.err.println("The size of the mall after clearing:-"+collection.size());
		collection.add(mall16);
		collection.add(mall17);
		collection.add(mall18);
		collection.add(mall19);
		collection.add(mall20);
		collection.add(mall21);
		collection.add(mall22);
		collection.add(mall23);
		collection.add(mall24);
		collection.add(mall25);
		collection.add(mall26);
		collection.add(mall27);
		collection.add(mall28);
		collection.add(mall29);
		System.out.println("The size of the after adding some mall:-"+collection.size());
		
		
	}

}
