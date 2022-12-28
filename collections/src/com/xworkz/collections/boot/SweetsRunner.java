package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.TreeSet;

public class SweetsRunner {

	public static void main(String[] args) {
		String Sweet1 ="gulab Jamun";
		String Sweet2 ="Jalebi";
		String Sweet3 ="Kheer";
		String Sweet4 ="Shrikhand";
		String Sweet5 ="Rasmalai";
		String Sweet6 ="Ghevar";
		String Sweet7 ="Rasgulla";
		String Sweet8 ="Malupu";
		String Sweet9 ="Laddoo";
		String Sweet10 ="Kulfi";
		String Sweet11="Basundi";
		String Sweet12="Mysore Pak";
		String Sweet13 ="Khaja";
		
		Collection<String> collention = new TreeSet();
		
		collention.add(Sweet1);
		collention.add(Sweet2);
		collention.add(Sweet3);
		collention.add(Sweet4);
		collention.add(Sweet5);
		collention.add(Sweet6);
		collention.add(Sweet7);
		collention.add(Sweet8);
		collention.add(Sweet9);
		collention.add(Sweet10);
		collention.add(Sweet11);
		collention.add(Sweet12);
		collention.add(Sweet13);
		System.out.println(collention.size());
		collention.clear();
		System.out.println("After clearing and Adding");
		collention.add(Sweet7);
		collention.add(Sweet8);
		collention.add(Sweet9);
		collention.add(Sweet10);
		collention.add(Sweet11);
		collention.add(Sweet12);
		collention.add(Sweet13);
		System.out.println(collention.size());
		System.err.println("__________________________________");
	}

}
