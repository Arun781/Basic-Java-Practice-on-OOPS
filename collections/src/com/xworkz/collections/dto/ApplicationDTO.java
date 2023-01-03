package com.xworkz.collections.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable{
	private String name;
	private Double version;
	private boolean free;
	private String developedBy;
	private double price;
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}
	public ApplicationDTO(String name, Double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ApplicationDTO) {
				ApplicationDTO applicationDTO=(ApplicationDTO) obj;{
					if(name.equals(this.name) && price==(this.price));
				}
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
