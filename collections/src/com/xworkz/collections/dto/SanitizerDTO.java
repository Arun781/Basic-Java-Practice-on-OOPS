package com.xworkz.collections.dto;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {
	
	private String brand;
	private String name;
	private String company;
	private String location;
	private String owner;
	private Double price;
	private boolean alchohalFree;
	private boolean approvedByWHO;
	private String flavour;
	private float quantity;
	private String colur;
	
	public SanitizerDTO() {
		System.out.println("default Constrctor");
	}

	@Override
	public String toString() {
		return "SanitizerDTO [brand=" + brand + ", name=" + name + ", company=" + company + ", location=" + location
				+ ", owner=" + owner + ", price=" + price + ", alchohalFree=" + alchohalFree + ", approvedByWHO="
				+ approvedByWHO + ", flavour=" + flavour + ", quantity=" + quantity + ", colur=" + colur + "]";
	}

	public SanitizerDTO(String brand, String name, String company, String location, String owner, Double price,
			boolean alchohalFree, boolean approvedByWHO, String flavour, float quantity, String colur) {
		super();
		this.brand = brand;
		this.name = name;
		this.company = company;
		this.location = location;
		this.owner = owner;
		this.price = price;
		this.alchohalFree = alchohalFree;
		this.approvedByWHO = approvedByWHO;
		this.flavour = flavour;
		this.quantity = quantity;
		this.colur = colur;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isAlchohalFree() {
		return alchohalFree;
	}

	public void setAlchohalFree(boolean alchohalFree) {
		this.alchohalFree = alchohalFree;
	}

	public boolean isApprovedByWHO() {
		return approvedByWHO;
	}

	public void setApprovedByWHO(boolean approvedByWHO) {
		this.approvedByWHO = approvedByWHO;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getColur() {
		return colur;
	}

	public void setColur(String colur) {
		this.colur = colur;
	}
	
}
