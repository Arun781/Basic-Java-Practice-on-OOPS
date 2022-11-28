package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.PhoneFollow;

public class PhoneFollowrunner {

	public static void main(String[] args) {
		PhoneFollow phoneFollow = new PhoneFollow();
		phoneFollow.configOfPhone();
		phoneFollow.modelOfPhone();
		phoneFollow.nameOfPhone();
		phoneFollow.priceOfPhone();
		phoneFollow.yearOfPhone();

	}

}
