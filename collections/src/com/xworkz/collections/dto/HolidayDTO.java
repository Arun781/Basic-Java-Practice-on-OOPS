package com.xworkz.collections.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable{
	private String name;
	private Integer noOfDays;
	private String plannings;
	
	public HolidayDTO() {
		System.out.println("Running the Holiday No arg constr");
	}

	public HolidayDTO(String name, Integer noOfDays, String plannings) {
		super();
		this.name = name;
		this.noOfDays = noOfDays;
		this.plannings = plannings;
	}
	@Override
	public boolean equals(Object ref) {
		if (ref != null) {
			if (ref instanceof HolidayDTO) {
				HolidayDTO dto = (HolidayDTO) ref;
				if (dto.noOfDays.equals(this.noOfDays)) {
					System.out.println("noOfDays is matching :-" + dto.noOfDays);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "HolidayDTO [name=" + name + ", noOfDays=" + noOfDays + ", plannings=" + plannings + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getPlannings() {
		return plannings;
	}

	public void setPlannings(String plannings) {
		this.plannings = plannings;
	}
	
	
}
