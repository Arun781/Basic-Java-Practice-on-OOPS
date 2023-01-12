package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("PencilName")
	private String PencilName;
	@Autowired
	@Qualifier("PencilType")
	private String PencilType;
	@Autowired
	@Qualifier("price")
	private int price;
	@Autowired
	@Qualifier("pencilColur")
	private String pencilColur;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("PencilStolen")
	private boolean PencilStolen;

	public Pencil() {
		System.out.println("Running the Pencil no arg const");
	}

	@Override
	public String toString() {
		return "Pencil [PencilName=" + PencilName + ", PencilType=" + PencilType + ", price=" + price + ", pencilColur="
				+ pencilColur + ", sharp=" + sharp + ", PencilStolen=" + PencilStolen + "]";
	}

	


}
