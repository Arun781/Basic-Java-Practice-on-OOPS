package com.xworkz.view.cinema;

import com.xworkz.view.constant.Names;

public class CinemaRunner {
	public static void main(String[] args) {
		String[] telugu = { "prabhas", "Mahesh", "Allu Arjun" };
		String[] horror = { "mummy", "Conjuring" };
		String[] kannada = { "Darshan", "Puneeth", "Yash" };
		String[] hindi = { "SalMan Khan", "Sharuq Khan" };
		
		Cinema prefer = new Cinema("kannada","Movie","lang","national lang",25,Names.Fidaa,Names.LoveMocktail,telugu,horror,kannada,hindi);
        prefer.displayShow();
	}

}
