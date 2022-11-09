package com.xworkz.casting.runner;

import com.xworkz.casting.main.DJ;
import com.xworkz.casting.main.DjParty;

public class DJRunner {

	public static void main(String[] args) {
		DJ dj=new DjParty("disco","hundred",654793L);
		System.out.println("dj name is: "+dj.djName);
		System.out.println("no of djs are: "+dj.noOfDjs);
		System.out.println("dj price  is: "+dj.price);
		
		Object obj=new DjParty();
		if(obj instanceof DJ) {
			DJ dj1=(DJ)obj;
			System.out.println(dj1.djName);
			System.out.println(dj1.noOfDjs);
			System.out.println(dj1.price);
			
		}
		


	}

}
