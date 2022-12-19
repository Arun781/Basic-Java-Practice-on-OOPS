package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.Parking;
import com.xworkz.crud.exception.AbstractAudit;

public class BuildingDTO extends AbstractAudit{
	private double no;
	private String name;
	private int floors;
	private boolean lift;
	private Parking parking;
	private String type;
	
	public BuildingDTO() {
		super();
		System.out.println("Running the No Arguments BuildingDTO constructor");
	}
	
	public BuildingDTO(double no, String name, int floors, boolean lift, Parking parking, String type,String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}
	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	public double getNo() {
		return no;
	}
	public void setNo(double no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public boolean isLift() {
		return lift;
	}
	public void setLift(boolean lift) {
		this.lift = lift;
	}
	public Parking getParking() {
		return parking;
	}
	public void setParking(Parking parking) {
		this.parking = parking;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
