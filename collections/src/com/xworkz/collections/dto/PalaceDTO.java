package com.xworkz.collections.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable{
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double entryFee;
	
	public PalaceDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", entryFee=" + entryFee + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO) obj;{
					if(name.equals(this.name) && location.equals(this.location));
				}
			}
		}
		return false;
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double entryFee) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.entryFee = entryFee;
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

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean getDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyedBy) {
		this.destroyed = destroyedBy;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}
}
