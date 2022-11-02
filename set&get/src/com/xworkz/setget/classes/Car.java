package com.xworkz.setget.classes;
public class Car {
	private String carName="Mahindra XUV700";
	double model=2022;
	String fuelType ="Disel";
	int noofcylinder=4;
	String transmissionType="Automatic";
	String bodyType="SUV";
	int groundClearanceUnladen = 226;
	double fuelTankCapacity=570.0;
	int seatingCapacity=8;
	int gearBox=6;
	double dieselHighwayMileage =10.0;
	String steeringType="Power";
	public Car() {
		// TODO Auto-generated constructor stub
	}
	void setCarName(String carName) {
		this.carName = carName;
	}
	void setModel(double model) {
		this.model = model;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	void setNoofcylinder(int noofcylinder) {
		this.noofcylinder = noofcylinder;
	}
	void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	void setGroundClearanceUnladen(int groundClearanceUnladen) {
		this.groundClearanceUnladen = groundClearanceUnladen;
	}
	void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	void setGearBox(int gearBox) {
		this.gearBox = gearBox;
	}
	void setDieselHighwayMileage(double dieselHighwayMileage) {
		this.dieselHighwayMileage = dieselHighwayMileage;
	}
	void setSteeringType(String steeringType) {
		this.steeringType = steeringType;
	}
	public String getCarName() {
		return carName;
	}
	public double getModel() {
		return model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public int getNoofcylinder() {
		return noofcylinder;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public String getBodyType() {
		return bodyType;
	}
	public int getGroundClearanceUnladen() {
		return groundClearanceUnladen;
	}
	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public int getGearBox() {
		return gearBox;
	}
	public double getDieselHighwayMileage() {
		return dieselHighwayMileage;
	}
	public String getSteeringType() {
		return steeringType;
	}
}
