package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.PersonFollow;

public class PersonFollowRunner {

	public static void main(String[] args) {
		PersonFollow personFollow = new PersonFollow();
		personFollow.ageOfPerson();
		personFollow.ageOfPerson();
		personFollow.locationOfPerson();
		personFollow.nameOfPerson();
		personFollow.phoneNumOfPerson();
	}

}
