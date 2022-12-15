package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.PizzaSize;
import com.xworkz.crud.exception.AbstractAudit;

public class PizzaDTO extends AbstractAudit {
	private String name;
	private String company;
	private PizzaSize size;
	private String flavour;
	private String type;
	private boolean cheese;
	private double price;
	
	public PizzaDTO() {
		System.out.println("Running the Default PizzaDTO Constructor");
	}

	public PizzaDTO(String name, String company, PizzaSize size, String flavour, String type, boolean cheese,double price,String createdBy,  LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy,createdDate,updatedBy,updatedDate);
		this.name = name;
		this.company = company;
		this.size = size;
		this.flavour = flavour;
		this.type = type;
		this.cheese = cheese;
		this.price = price;
	}

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", size=" + size + ", flavour=" + flavour + ", type="
				+ type + ", cheese=" + cheese + ", price=" + price + ", toString()=" + super.toString() + "]";
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

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public void setUpdatedDate(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	

}
