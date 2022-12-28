package com.xworkz.collections.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
	private String name;
	private String State;
	private String Country;
	public PlaceDTO() {
		System.out.println("Default Construtor");
	}
	public PlaceDTO(String name, String state, String country) {
		super();
		this.name = name;
		State = state;
		Country = country;
	}
	@Override
	public boolean equals(Object ref) {
		if (ref != null) {
			if (ref instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO) ref;
				if (dto.Country.equals(this.Country)) {
					System.out.println("Country is matching :-" + dto.Country);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", State=" + State + ", Country=" + Country + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
}
