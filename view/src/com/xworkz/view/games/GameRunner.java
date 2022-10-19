package com.xworkz.view.games;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] playersNames = {"Kohil","Rohit","Rahul"};
		String [] academyNames = {"India","Aus","SA","WI"};
		String [] stadiumNames = {"ChinnaSwamy","Mumbai"};
		String [] coachNames= {"Rahul Dravid","Ravi Shatri"};
		String [] awards= {"IPL","ODI","T20"};
		String [] matches= {"AUS vs IND","SA vs IND", "IND vs PAK"};
		Game prefer = new Game("Cricket",11,"Bang","Indian","Wed",250000l,playersNames,academyNames,stadiumNames,coachNames,awards,matches);
		prefer.Display();

	}

}
