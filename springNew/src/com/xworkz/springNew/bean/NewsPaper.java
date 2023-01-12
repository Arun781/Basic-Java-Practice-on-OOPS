package com.xworkz.springNew.bean;

import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("id")
	private String id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("lang")
	private String lang;
	private Double price;

	public NewsPaper( String name,@Qualifier("ownerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
