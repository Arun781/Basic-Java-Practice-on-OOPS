package com.xworkz.setget.classes;

public class CarModify {
	public void Modify(Car car) {
		car.setCarName("Hyundai Creta");
		car.setModel(2023);
		car.setFuelType("Petrole");
		car.setNoofcylinder(4);
		car.setTransmissionType("Automatic Type");
		car.setBodyType("SUV");
		car.setGroundClearanceUnladen(225);
		car.setGearBox(6);
		car.setDieselHighwayMileage(15.5);
		car.setSeatingCapacity(5);
		car.setSteeringType("Power Sterring");
		
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
	}

}
