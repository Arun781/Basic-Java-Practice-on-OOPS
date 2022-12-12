package com.xworkz.crud.repository;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAudit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private String updatedDate;

	public AbstractAudit() {
		System.out.println("Creating the no Arguments Cons");
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime localDateTime) {
		this.createdDate = localDateTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
}
