package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.exception.AbstractAudit;

public class PlaceDTO extends AbstractAudit {
	private String nameOfPlace;
	private Double arenInSQKM;
	private String distName;
	private String taName;
	private String stateName;

	public PlaceDTO() {
		System.out.println("Running the No Arguments constructor");
	}

	public PlaceDTO(String nameOfPlace, Double arenInSQKM, String distName, String taName, String stateName,
			String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.nameOfPlace = nameOfPlace;
		this.arenInSQKM = arenInSQKM;
		this.distName = distName;
		this.taName = taName;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "PlaceDTO [nameOfPlace=" + nameOfPlace + ", arenInSQKM=" + arenInSQKM + ", distName=" + distName
				+ ", TaName=" + taName + ", stateName=" + stateName + ", toString()=" + super.toString() + "]";
	}

	public String getNameOfPlace() {
		return nameOfPlace;
	}

	public void setNameOfPlace(String nameOfPlace) {
		this.nameOfPlace = nameOfPlace;
	}

	public Double getArenInSQKM() {
		return arenInSQKM;
	}

	public void setArenInSQKM(Double arenInSQKM) {
		this.arenInSQKM = arenInSQKM;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public String getTaName() {
		return taName;
	}

	public void setTaName(String taName) {
		taName = taName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
