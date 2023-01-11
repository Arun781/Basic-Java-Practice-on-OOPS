package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("id")
	private String idName;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("gst")
	private String gstNo;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;

	public HardwareShop() {
		System.out.println("Created HardwareShop using no arg cons...");
	}

	@Override
	public String toString() {
		return "HardwareShop [idName=" + idName + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
