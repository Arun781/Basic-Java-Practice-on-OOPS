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
	private String colur;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("PencilStolen")
	private boolean stolen;

	public Pencil() {
		System.out.println("Running the Pencil no arg const");
	}

	@Override
	public String toString() {
		return "Pencil [PencilName=" + PencilName + ", PencilType=" + PencilType + ", price=" + price + ", colur="
				+ colur + ", sharp=" + sharp + ", stolen=" + stolen + "]";
	}

	


}
