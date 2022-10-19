package com.xworkz.view.games;

public class Game {
	public String gameName;
	public int players;
	public String venue;
	public String day;
	public String academy;
	public long fees;
	public String[] playersName;
	public String[] academyName;
	public String[] stadiumName;
	public String[] coachName;
	public String[] awards;
	public String[] matches;

	public Game(String gameName, int players, String venue, String day, String academy, long fees, String[] playersName,
			String[] academyName, String[] stadiumName, String[] coachName, String[] awards, String[] matches) {
		super();
		this.gameName = gameName;
		this.players = players;
		this.venue = venue;
		this.day = day;
		this.academy = academy;
		this.fees = fees;
		this.playersName = playersName;
		this.academyName = academyName;
		this.stadiumName = stadiumName;
		this.coachName = coachName;
		this.awards = awards;
		this.matches = matches;
	}

	public void Display() {
		System.out.println(this.gameName);
		System.out.println(this.players);
		System.out.println(this.venue);
		System.out.println(this.day);
		System.out.println(this.academy);
		System.out.println(this.fees);
		System.out.println(this.playersName);
		System.out.println(this.academyName);
		System.out.println(this.stadiumName);
		System.out.println(this.coachName);
		System.out.println(this.awards);
		System.out.println(this.matches);
		System.out.println(System.lineSeparator());

		for (int i = 0; i < playersName.length; i++) {
			String ref = playersName[i];
			System.out.println(ref);
		}
		for (int i = 0; i < academyName.length; i++) {
			String ref = academyName[i];
			System.out.println(ref);
		}
		for (int i = 0; i < stadiumName.length; i++) {
			String ref = stadiumName[i];
			System.out.println(ref);
		}
		for (int i = 0; i < coachName.length; i++) {
			String ref = coachName[i];
			System.out.println(ref);
		}
		for (int i = 0; i < awards.length; i++) {
			String ref = awards[i];
			System.out.println(ref);
		}
		for (int i = 0; i < matches.length; i++) {
			String ref = matches[i];
			System.out.println(ref);
		}
		
	}

}
