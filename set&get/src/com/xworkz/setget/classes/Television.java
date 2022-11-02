package com.xworkz.setget.classes;

public class Television {
	private String brand="SAMSUNG";
	String televisionModel ="UA32T4380AKXXL";
	double launchYear=2022;
	double price=13499;
	int size=32;
	boolean smartTV=true;
	boolean blackAndwhiteTV=false;
	int hdmi=2;
	int usb=1;
	String builtInWifi="Yes";
	String wallMounted="Yes";
	public Television() {
		// TODO Auto-generated constructor stub
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setTelevisionModel(String televisionModel) {
		this.televisionModel = televisionModel;
	}
	void setLaunchYear(double launchYear) {
		this.launchYear = launchYear;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setSize(int size) {
		this.size = size;
	}
	void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	void setBlackAndwhiteTV(boolean blackAndwhiteTV) {
		this.blackAndwhiteTV = blackAndwhiteTV;
	}
	void setHdmi(int hdmi) {
		this.hdmi = hdmi;
	}
	void setUsb(int usb) {
		this.usb = usb;
	}
	void setBuiltInWifi(String builtInWifi) {
		this.builtInWifi = builtInWifi;
	}
	void setWallMounted(String wallMounted) {
		this.wallMounted = wallMounted;
	}
	public String getBrand() {
		return brand;
	}
	public String getTelevisionModel() {
		return televisionModel;
	}
	public double getLaunchYear() {
		return launchYear;
	}
	public double getPrice() {
		return price;
	}
	public int getSize() {
		return size;
	}
	public boolean isSmartTV() {
		return smartTV;
	}
	public boolean isBlackAndwhiteTV() {
		return blackAndwhiteTV;
	}
	public int getHdmi() {
		return hdmi;
	}
	public int getUsb() {
		return usb;
	}
	public String getBuiltInWifi() {
		return builtInWifi;
	}
	public String getWallMounted() {
		return wallMounted;
	}
	
	

}
