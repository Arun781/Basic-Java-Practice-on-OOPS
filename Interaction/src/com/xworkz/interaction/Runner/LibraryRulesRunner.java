package com.xworkz.interaction.runner;

import com.xworkz.interaction.rules.AccountHolder;
import com.xworkz.interaction.rules.Librarian;

public class LibraryRulesRunner {

	public static void main(String[] args) {
		Librarian librarian = new Librarian();
		AccountHolder accountHolder = new AccountHolder(librarian);
		accountHolder.checkAccountHolder();

	}

}
