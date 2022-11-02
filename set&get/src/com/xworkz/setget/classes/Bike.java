package com.xworkz.setget.classes;

public class Bike {
	private String bikeBrand ="KTM";
	double bore=72;
	String wheelsType="Alloy";
	double modelName=2022;
	String engineType="Single Cylinder, 4 Valve, Liquid Cooled, FI, DOHC";
	double wheelSizerear=431.5;
	double wheelSizeback=431.5;
	double engineDisplacement=199.5;
	double maxTorque=8000;
	double stroke=49.0;
	String speedometer = "Digital";
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}
	void setBore(double bore) {
		this.bore = bore;
	}
	void setWheelsType(String wheelsType) {
		this.wheelsType = wheelsType;
	}
	void setModelName(double modelName) {
		this.modelName = modelName;
	}
	void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	void setWheelSizerear(double wheelSizerear) {
		this.wheelSizerear = wheelSizerear;
	}
	void setWheelSizeback(double wheelSizeback) {
		this.wheelSizeback = wheelSizeback;
	}
	void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	void setMaxTorque(double maxTorque) {
		this.maxTorque = maxTorque;
	}
	void setStroke(double stroke) {
		this.stroke = stroke;
	}
	void setSpeedometer(String speedometer) {
		this.speedometer = speedometer;
	}
	public String getBikeBrand() {
		return bikeBrand;
	}
	public double getBore() {
		return bore;
	}
	public String getWheelsType() {
		return wheelsType;
	}
	public double getModelName() {
		return modelName;
	}
	public String getEngineType() {
		return engineType;
	}
	public double getWheelSizerear() {
		return wheelSizerear;
	}
	public double getWheelSizeback() {
		return wheelSizeback;
	}
	public double getEngineDisplacement() {
		return engineDisplacement;
	}
	public double getMaxTorque() {
		return maxTorque;
	}
	public double getStroke() {
		return stroke;
	}
	public String getSpeedometer() {
		return speedometer;
	}

}
