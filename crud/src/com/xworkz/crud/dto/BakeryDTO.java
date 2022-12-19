package com.xworkz.crud.dto;

import java.time.LocalDateTime;
import com.xworkz.crud.constant.Names;
import com.xworkz.crud.exception.AbstractAudit;

public class BakeryDTO extends AbstractAudit{
	private Names name;
	private String ownerName;
	private String location;
	private long pNo;
	private String famousFor;
	
	public BakeryDTO() {
		System.err.println("Running the No arguments Constructor");
	}

	public BakeryDTO(Names name, String ownerName, String location, long pNo, String famousFor,String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.pNo = pNo;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", pNo=" + pNo
				+ ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}

	public Names getName() {
		return name;
	}

	public void setName(Names name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getpNo() {
		return pNo;
	}

	public void setpNo(long pNo) {
		this.pNo = pNo;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	
}
