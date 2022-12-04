package com.xworkz.interaction.rules;

public class AccountHolder {
	private Librarian librarianFollows;
	public AccountHolder() {
		System.out.println("Creating the Default Constructor");
	}
	public AccountHolder(Librarian librarianFollows) {
		this.librarianFollows=librarianFollows;
	}
	public void checkAccountHolder() {
		System.out.println("Checking the checkAccountHolder");
		if(librarianFollows != null) {
			int numOfBooks = this.librarianFollows.numOfBooks();
			boolean silence = this.librarianFollows.silence();
			if(numOfBooks==1 && silence==false) {
				System.out.println("The AccountHolder following the rules");
			}
			else {
				System.out.println("The AccountHolder not following the rules");
			}
		}
	}
}
