package com.xworkz.collections.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	private String name;
	private String location;
	private String counsil;

	public AirportDTO() {
		System.out.println("Running Default constructor:-");
	}

	public AirportDTO(String name, String location, String counsil) {
		super();
		this.name = name;
		this.location = location;
		this.counsil = counsil;
	}

	@Override
	public boolean equals(Object ref) {
		if (ref != null) {
			if (ref instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO) ref;
				if (dto.counsil.equals(this.counsil)) {
					System.out.println("counsil is matching :-" + dto.counsil);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", location=" + location + ", counsil=" + counsil + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCounsil() {
		return counsil;
	}

	public void setCounsil(String counsil) {
		this.counsil = counsil;
	}
}
