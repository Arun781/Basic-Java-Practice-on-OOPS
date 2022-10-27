package com.xworkz.association.classfiles;

//Temple: name,god:custom,mainPriest,noOfVisitor,collectionPerDay
public class Temple {
	public String name;
	public String mainPriest;
	public God god = new God("Hanuman", 'M', "Caanot Describe", "Gada");
	
	public Temple(String name, String mainPriest) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
	}

	public void noOfVisitor(int visitors) {
		System.out.println("The num of Vis" + visitors);
	}

	public void collectionPerDay(long collection) {
		System.out.println("The collection per day :-" + collection);
	}

	public void god(String name) {
		if (god != null) {
			System.out.println("Hanuman");
		} else {
		}
		System.out.println("Devru Illa");
	}

	public void ShowOff() {
		System.out.println(this.name);
		System.out.println(this.god);
		collectionPerDay(50000l);
		noOfVisitor(500);
		System.out.println(this.god);
	}

}
