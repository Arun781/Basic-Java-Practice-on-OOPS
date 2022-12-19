package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.exception.AbstractAudit;

public class RailWayStationDTO extends AbstractAudit{
	private String name;
	private Double noOfPlatForms;
	private String area;
	private double platFormTicketPrice;
	
	public RailWayStationDTO() {
		System.out.println("Running the no Arguments RailwayDTO construtor");
	}
	public RailWayStationDTO(String name, Double noOfPlatForms, String area, double platFormTicketPrice,String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.noOfPlatForms = noOfPlatForms;
		this.area = area;
		this.platFormTicketPrice = platFormTicketPrice;
	}
	@Override
	public String toString() {
		return "RailWayStationDTO [name=" + name + ", noOfPlatForms=" + noOfPlatForms + ", area=" + area
				+ ", platFormTicketPrice=" + platFormTicketPrice + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getNoOfPlatForms() {
		return noOfPlatForms;
	}
	public void setNoOfPlatForms(Double noOfPlatForms) {
		this.noOfPlatForms = noOfPlatForms;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getPlatFormTicketPrice() {
		return platFormTicketPrice;
	}
	public void setPlatFormTicketPrice(double platFormTicketPrice) {
		this.platFormTicketPrice = platFormTicketPrice;
	}
	
}
