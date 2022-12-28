package com.xworkz.collections.dto;

import java.io.Serializable;

public class CalendarDTO implements Serializable {
	 private String name;
	 private Double year;
	 private Integer price;
	 
	 public CalendarDTO() {
		System.out.println("Default Constructor Running :-");
	}

	public CalendarDTO(String name, Double year, Integer price) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
	}
	@Override
	public boolean equals(Object ref) {
		if (ref != null) {
			if (ref instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO) ref;
				if (dto.year.equals(this.year)) {
					System.out.println("year is matching :-" + dto.year);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "CalendarDTO [name=" + name + ", year=" + year + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getYear() {
		return year;
	}

	public void setYear(Double year) {
		this.year = year;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

 
}
