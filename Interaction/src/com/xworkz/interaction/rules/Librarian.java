package com.xworkz.interaction.rules;

public class Librarian implements LibraryRules {

	@Override
	public int numOfBooks() {
		System.out.println("Running the numOfBooks");
		return 0;
	}

	@Override
	public boolean silence() {
		System.out.println("Running the Silence");
		return false;
	}

}
