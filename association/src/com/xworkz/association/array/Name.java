package com.xworkz.association.array;

public class Name {
	public String currentName;
	public String presentName;
	public String futureName;

	public Name(String currentName) {
		super();
		this.currentName = currentName;
	}

	public void setpresentName(String presentName) {
		this.presentName = presentName;
	}

	public void setfutureName(String futureName) {
		this.futureName = futureName;
	}

	public void ShowOff() {
		System.out.println(this.currentName);
	}

}
