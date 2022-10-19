package com.xworkz.view.blackmagic;

public class Cricket {
	public String name;
	public String teamName;
	public String venue;
	public String dayOfMatch;
	public String coachName;
	public String [] batsMan;
	public String [] bowler;
	public String [] teams;
	public String [] cups;
	public String [] match;
	
	public Cricket() {
		System.out.println("The Declaring the information of Cricket");
	}
	public Cricket(String name,String teamName,String venue,String dayOfMatch, String coachName,String [] batsMan,String [] bowler,String [] teams,String [] cups, String [] match) {
		this.name=name;
		this.teamName=teamName;
		this.venue=venue;
		this.dayOfMatch=dayOfMatch;
		this.coachName=coachName;
		this.batsMan=batsMan;
		this.bowler=bowler;
		this.teams=teams;
		this.cups=cups;
		this.match=match;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.teamName);
		System.out.println(this.venue);
		System.out.println(this.dayOfMatch);
		System.out.println(this.coachName);
		System.out.println(this.batsMan);
		System.out.println(this.bowler);
		System.out.println(this.teams);
		System.out.println(this.cups);
		System.out.println(this.match);
		
		System.out.println(System.lineSeparator()+"compartmentsName:");
		
		for (int i = 0; i < batsMan.length; i++) {
			String ref = batsMan[i];
			System.out.println(ref);
		}
		for (int i = 0; i < bowler.length; i++) {
			String ref = bowler[i];
			System.out.println(ref);
		}
		for (int i = 0; i < teams.length; i++) {
			String ref = teams[i];
			System.out.println(ref);
		}
		for (int i = 0; i < cups.length; i++) {
			String ref = cups[i];
			System.out.println(ref);
		}
		for (int i = 0; i < match.length; i++) {
			String ref = match[i];
			System.out.println(ref);
		}
		
	}

}
