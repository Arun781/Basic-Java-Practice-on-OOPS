package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.BrandName;
import com.xworkz.crud.constant.ColurName;
import com.xworkz.crud.exception.AbstractAudit;

public class BikeDTO extends AbstractAudit {
	private String name;
	private BrandName brandName;
	private Double costOfBike;
	private ColurName colur;

	public BikeDTO() {
		System.out.println("Running the Default Constructor");
	}

	public BikeDTO(String name, BrandName brandName, Double costOfBike, ColurName colur, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);

		this.name = name;
		this.brandName = brandName;
		this.costOfBike = costOfBike;
		this.colur = colur;
	}

	@Override
	public String toString() {
		return "BikeDTO [name=" + name + ", brandName=" + brandName + ", costOfBike=" + costOfBike + ", colur=" + colur
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BrandName getBrandName() {
		return brandName;
	}

	public void setBrandName(BrandName brandName) {
		this.brandName = brandName;
	}

	public Double getCostOfBike() {
		return costOfBike;
	}

	public void setCostOfBike(Double costOfBike) {
		this.costOfBike = costOfBike;
	}

	public ColurName getColur() {
		return colur;
	}

	public void setColur(ColurName colur) {
		this.colur = colur;
	}

}
