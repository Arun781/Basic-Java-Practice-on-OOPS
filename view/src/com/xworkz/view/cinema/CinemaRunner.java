package com.xworkz.view.cinema;

import com.xworkz.view.constant.Names;

public class CinemaRunner {
	public static void main(String[] args) {
		String[] telugu = { "prabhas", "Mahesh", "Allu Arjun" };
		String[] horror = { "mummy", "Conjuring" };
		String[] kannada = { "Darshan", "Puneeth", "Yash" };
		String[] hindi = { "SalMan Khan", "Sharuq Khan" };
		String[] eng = { "Breath less", "SoundLess" };

		Cinema prefer = new Cinema("Kannada", "Rajkumar","PSPK","Rithik",250, Names.Fidaa, Names.GangLeader,telugu,horror,kannada,hindi,eng);
        prefer.displayShow();
	}

}
