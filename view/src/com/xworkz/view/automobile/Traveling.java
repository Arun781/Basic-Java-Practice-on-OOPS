package com.xworkz.view.automobile;

public class Traveling {
	public String from;
	public String to;
	public int estimatedCost;
	public String vechileType;
	public int members;
	public String[] names;
	public String[] numbers;
	public String[] places;
	public String[] food;
	public String[] typeOfSeats;

	public Traveling() {
		System.out.println("The Declaring the Traveling deatails");
	}

	public Traveling(String from, String to, int estimatedCost, String vechileType, int members, String[] names,
			String[] numbers, String[] places, String[] food, String[] typeOfSeats) {
		this.from = from;
		this.to = to;
		this.estimatedCost = estimatedCost;
		this.vechileType = vechileType;
		this.members = members;
		this.names = names;
		this.numbers = numbers;
		this.places = places;
		this.food = food;
		this.typeOfSeats = typeOfSeats;
	}

	public void display() {
		System.out.println(this.from);
		System.out.println(this.to);
		System.out.println(this.estimatedCost);
		System.out.println(this.vechileType);
		System.out.println(this.members);
		System.out.println(this.names);
		System.out.println(this.numbers);
		System.out.println(this.places);
		System.out.println(this.food);
		System.out.println(this.typeOfSeats);
		System.out.println(System.lineSeparator());
		for (int i = 0; i < names.length; i++) {
			String ref = names[i];
			System.out.println(ref);
		}
		for (int i = 0; i < numbers.length; i++) {
			String ref = numbers[i];
			System.out.println(ref);
		}
		for (int i = 0; i < places.length; i++) {
			String ref = places[i];
			System.out.println(ref);
		}
		for (int i = 0; i < food.length; i++) {
			String ref = food[i];
			System.out.println(ref);
		}
		for (int i = 0; i < typeOfSeats.length; i++) {
			String ref = typeOfSeats[i];
			System.out.println(ref);
		}
	}

}
