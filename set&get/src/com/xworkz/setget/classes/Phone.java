package com.xworkz.setget.classes;

public class Phone {
	private String brand="Redmi";
	String type="Redmi 7pro";
	double model=2018;
	double price=15550.0;
	long num=9620753670l;
	String owner="Arun";
	char chargerType ='C';
	int storage=64;
	int rom=8;
	String colur ="Black";
	String simType="Nano_Sim";
	String sensors="Fingerprint (side-mounted), Accelerometer, Gyro, Proximity, Compass";
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setType(String type) {
		this.type = type;
	}
	void setModel(double model) {
		this.model = model;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setNum(long num) {
		this.num = num;
	}
	void setOwner(String owner) {
		this.owner = owner;
	}
	void setChargerType(char chargerType) {
		this.chargerType = chargerType;
	}
	void setStorage(int storage) {
		this.storage = storage;
	}
	void setRom(int rom) {
		this.rom = rom;
	}
	void setColur(String colur) {
		this.colur = colur;
	}
	void setSimType(String simType) {
		this.simType = simType;
	}
	void setSensors(String sensors) {
		this.sensors = sensors;
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public double getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public long getNum() {
		return num;
	}
	public String getOwner() {
		return owner;
	}
	public char getChargerType() {
		return chargerType;
	}
	public int getStorage() {
		return storage;
	}
	public int getRom() {
		return rom;
	}
	public String getColur() {
		return colur;
	}
	public String getSimType() {
		return simType;
	}
	public String getSensors() {
		return sensors;
	}
	

}
