package com.xworkz.ExceptionalEvents.crud.runner;

import com.xworkz.ExceptionalEvents.crud.repository.EmailRepository;
import com.xworkz.ExceptionalEvents.crud.repository.EmailRepositoryImplements;

public class EmailRepositoriesRunner {

	public static void main(String[] args) {
		EmailRepository mails = new EmailRepositoryImplements();
		mails.create("arunbv.xworkz@gamil.com");
		mails.create("aishu.xworkz@gamil.com");
		mails.create("neeraj.xworkz@gamil.com");
		mails.create("shresham.xworkz@gamil.com");
		mails.create("shubham.xworkz@gamil.com");
		mails.create("Ravitej.xworkz@gamil.com");
		mails.create("shashi.xworkz@gamil.com");
		mails.create("afreen.xworkz@gamil.com");
		mails.create("pagal.xworkz@gamil.com");
		mails.create("iceCream.xworkz@gamil.com");
		System.out.println(mails.total());

	}

}
