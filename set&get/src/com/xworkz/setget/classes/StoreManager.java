package com.xworkz.setget.classes;

public class StoreManager {
	private String brand = "ITCC";
	String fragrance;
	double price;
	String ambassador;
	public String name = "Engage";
	String brandOwner = "ITC";
	String manufacturedInCountry = "INDIA";
	String manufacturingDate = "05/05/22";
	String expiryDate = "4/4/2025";
	int quanity = 2;
	public String getBrand() {
		return brand;
	}
	public String getFragrance() {
		return fragrance;
	}
	public double getPrice() {
		return price;
	}
	public String getAmbassador() {
		return ambassador;
	}
	public String getName() {
		return name;
	}
	public String getBrandOwner() {
		return brandOwner;
	}
	public String getManufacturedInCountry() {
		return manufacturedInCountry;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public int getQuanity() {
		return quanity;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}
	void setName(String name) {
		this.name = name;
	}
	void setBrandOwner(String brandOwner) {
		this.brandOwner = brandOwner;
	}
	void setManufacturedInCountry(String manufacturedInCountry) {
		this.manufacturedInCountry = manufacturedInCountry;
	}
	void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	void setQuanity(int quanity) {
		this.quanity = quanity;
	}

}
