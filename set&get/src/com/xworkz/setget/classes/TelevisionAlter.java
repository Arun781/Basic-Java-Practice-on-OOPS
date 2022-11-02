package com.xworkz.setget.classes;

public class TelevisionAlter {
	public void AlterTelevision(Television television) {
		television.setBrand(null);
		television.setTelevisionModel(null);
		television.setLaunchYear(0);
		television.setPrice(0);
		television.setSize(0);
		television.setSmartTV(false);
		television.setBlackAndwhiteTV(false);
		television.setHdmi(0);
		television.setUsb(0);
		television.setBuiltInWifi(null);
		television.setWallMounted(null);
		
		System.out.println(television.getBrand());
		System.out.println(television.getTelevisionModel());
		System.out.println(television.getLaunchYear());
		System.out.println(television.getPrice());
		System.out.println(television.getSize());
		System.out.println(television.getSize());
		System.out.println(television.getHdmi());
		System.out.println(television.getUsb());
		System.out.println(television.getBuiltInWifi());
		System.out.println(television.getWallMounted());
		//boolean hasCreatePermission= Boolean.parseBoolean(request.getParameter("hasCreatePermission")); 
		//System.out.println(television.get);
		//System.out.println(television.get);
		
	}

}
