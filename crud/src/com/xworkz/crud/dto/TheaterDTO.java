package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.exception.AbstractAudit;

public class TheaterDTO extends AbstractAudit {
	private String id;
	private String name;
	private String brand;
	private Double seats;

	public TheaterDTO() {
		System.out.println("Running the no arguments Constructor");
	}

	public TheaterDTO(String id, String name, String brand, Double seats, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getSeats() {
		return seats;
	}

	public void setSeats(Double seats) {
		this.seats = seats;
	}

}
