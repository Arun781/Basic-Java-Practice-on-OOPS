package com.xworkz.equals.main;

public class Vehicle {
	private String nameOfVehicle;
	private String modelName;
	private String company;
	private double price;
	private double num;
	private String size;
	private String wheelType;
	private String fuelType;
	private long registrationNum; 
	private double model;
	
	public Vehicle() {
		System.out.println("Declaring the properties of Vehicle for checking equals");
	}

	public Vehicle(String nameOfVehicle, String modelName, String company, double price, double num, String size,
			String wheelType, String fuelType, long registrationNum, double model) {
		super();
		this.nameOfVehicle = nameOfVehicle;
		this.modelName = modelName;
		this.company = company;
		this.price = price;
		this.num = num;
		this.size = size;
		this.wheelType = wheelType;
		this.fuelType = fuelType;
		this.registrationNum = registrationNum;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [nameOfVehicle=" + nameOfVehicle + ", modelName=" + modelName + ", company=" + company
				+ ", price=" + price + ", num=" + num + ", size=" + size + ", wheelType=" + wheelType + ", fuelType="
				+ fuelType + ", registrationNum=" + registrationNum + ", model=" + model + "]";
	}
	
	public boolean equals(Object convert) {
		if(convert instanceof Vehicle) {
			System.err.println("If convert is Vehicle can check the properties");
			Vehicle vehicle=(Vehicle) convert;
			System.out.println(vehicle);
		}
		else {
			System.out.println("If convert is not Vehicle, cannot check the properties");
		}
		return false;	
	}

	public String getNameOfVehicle() {
		return nameOfVehicle;
	}

	public void setNameOfVehicle(String nameOfVehicle) {
		this.nameOfVehicle = nameOfVehicle;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWheelType() {
		return wheelType;
	}

	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public long getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(long registrationNum) {
		this.registrationNum = registrationNum;
	}

	public double getModel() {
		return model;
	}

	public void setModel(double model) {
		this.model = model;
	}
	

}
