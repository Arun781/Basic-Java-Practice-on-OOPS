package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.CarFollow;

public class CarFollowRunner {

	public static void main(String[] args) {
		CarFollow carFollow = new CarFollow();
		carFollow.modelOfCar();
		carFollow.NameOfCar();
		carFollow.priceOfCar();
		carFollow.typeOfCar();
		carFollow.yearOfCar();
	}

}
