package com.xworkz.collections.dto;

import java.io.Serializable;

import com.xworkz.collections.enums.VesrionType;

public class DataBaseVendorDTO implements Serializable{
	private String  name;
	private String developedBy;
	private VesrionType type;
	private double size;
	private double licennseCost;
	
	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String name, String developedBy, VesrionType type, double size, double licennseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licennseCost = licennseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licennseCost=" + licennseCost + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dataBaseVendorDTO = (DataBaseVendorDTO) obj;{
					if(name.equals(this.name) && size==this.size) {
						System.out.println("name and size are matching");
					}
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public VesrionType getType() {
		return type;
	}

	public void setType(VesrionType type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicennseCost() {
		return licennseCost;
	}

	public void setLicennseCost(double licennseCost) {
		this.licennseCost = licennseCost;
	}
	
}
