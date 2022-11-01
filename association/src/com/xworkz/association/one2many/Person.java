package com.xworkz.association.one2many;

public class Person {
	public String name;
	public Email[] emails;
	public Job job;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	public void Setemail(Email[] emails) {
		this.emails = emails;
	}

	public void Setjob(Job job) {
		this.job = job;
	}

	public void Display() {
		System.out.println("Persona Name"+name);
		if (this.job != null) {
			System.out.println("Display job profile");
			this.job.ShowOff();
		}
		if (emails != null) {
			for (int i = 0; i < emails.length; i++) {
				Email email1 = emails[i];
				//System.out.println("The E-Mail is"+email1);
				if (email1 != null) {
					email1.ShowOff();
				} else {
					System.out.println("Email is Null");
				}
			}
		} else {
			System.out.println("No Email ID Found");
		}

	}

}
