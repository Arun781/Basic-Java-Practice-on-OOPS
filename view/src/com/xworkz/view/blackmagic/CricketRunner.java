package com.xworkz.view.blackmagic;

public class CricketRunner {

	public static void main(String[] args) {
		 String [] batsMans = {"Kohil","Rohit","Rahul","Dhoni","SACHIN"};
		 String [] bowlers = {"Shammi","Bhuvaneswar","Bhumbra","Arpith Sigh","Chahal"};
		 String [] teamsOfInternational = {"Aus","Ind","ENG","PAK","SRI","SA"};
		 String [] cupsOfInternational = {"T20","IPL","World Cup","Asian Cup"};
		 String [] match = {"ind vs pak","IND vs SA", "AUS vs IND"};
		 
		 Cricket preference = new Cricket("KOHIL","INDIA","MUMBAI","WED","RAHUL",batsMans,bowlers,teamsOfInternational,cupsOfInternational,match);
		 preference.display();
	}
	
}
