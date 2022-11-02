package com.xworkz.setget.classes;

public class Plastic {
	private String name ="nope";
	public String brandName ="nope";
	boolean quality=true;
	String usedfor="packing";
	int price=10;
	int length=70;
	int width=50;
	int weigthingrams=5;
	String colour="black";
	int Hydrobromide=10;
	int Hydrochloride=5;

	void setHydrobromide(int hydrobromide) {
		Hydrobromide = hydrobromide;
	}
	void setHydrochloride(int hydrochloride) {
		Hydrochloride = hydrochloride;
	}
	public int getHydrobromide() {
		return Hydrobromide;
	}
	public int getHydrochloride() {
		return Hydrochloride;
	}
	public Plastic() {
		// TODO Auto-generated constructor stub
	}
	void setName(String name) {
		this.name = name;
	}
	void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	void setQuality(boolean quality) {
		this.quality = quality;
	}
	void setUsedfor(String usedfor) {
		usedfor = usedfor;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setLength(int length) {
		this.length = length;
	}
	void setWidth(int width) {
		this.width = width;
	}
	void setWeigthingrams(int weigthingrams) {
		this.weigthingrams = weigthingrams;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public String getBrandName() {
		return brandName;
	}
	public boolean isQuality() {
		return quality;
	}
	public String getUsedfor() {
		return usedfor;
	}
	public int getPrice() {
		return price;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getWeigthingrams() {
		return weigthingrams;
	}
	public String getColour() {
		return colour;
	}
	
}
