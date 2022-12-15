package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.ColurName;
import com.xworkz.crud.constant.Type;
import com.xworkz.crud.exception.AbstractAudit;

public class HelmetDTO extends AbstractAudit {

	private String name;
	private ColurName colur;
	private Double price;
	private Type type;

	public HelmetDTO(String string, Type halfHelmet, ColurName black, double d) {
		System.out.println("Running the HelmetDTO no Arguments Constructor");
	}

	public HelmetDTO(String name, ColurName colur, Double price, Type type, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.colur = colur;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "HelmetDTO [name=" + name + ", colur=" + colur + ", price=" + price + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ColurName getColur() {
		return colur;
	}

	public void setColur(ColurName colur) {
		this.colur = colur;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
