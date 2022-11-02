package com.xworkz.association.one2many;

public class State {
	public String nameOfState;
	public int numOfDist;
	public int numOfState;
	public String capitalName;
	public State(String nameOfState, int numOfDist, int numOfState, String capitalName) {
		super();
		this.nameOfState = nameOfState;
		this.numOfDist = numOfDist;
		this.numOfState = numOfState;
		this.capitalName = capitalName;
	}
	public void ShowOff() {
		System.out.println("=====================================================");
		System.out.println("Declaring the State info");
		System.out.println(this.nameOfState);
		System.out.println(this.numOfDist);
		System.out.println(this.numOfState);
		System.out.println(this.capitalName);
	}

}
