package com.xworkz.setget.runner;

import com.xworkz.setget.classes.Car;
import com.xworkz.setget.classes.CarModify;

public class CarRunner {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getCarName());
		System.out.println(car.getModel());
		System.out.println(car.getFuelType());
		System.out.println(car.getNoofcylinder());
		System.out.println(car.getTransmissionType());
		System.out.println(car.getBodyType());
		System.out.println(car.getGroundClearanceUnladen());
		System.out.println(car.getGearBox());
		System.out.println(car.getDieselHighwayMileage());
		System.out.println(car.getSeatingCapacity());
		System.out.println(car.getSteeringType());
		System.out.println("====================================");
		CarModify carModify = new CarModify();
		carModify.Modify(car);
		System.out.println(car);
	}

}
