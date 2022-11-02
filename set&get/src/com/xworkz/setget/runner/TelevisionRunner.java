package com.xworkz.setget.runner;

import com.xworkz.setget.classes.Television;
import com.xworkz.setget.classes.TelevisionAlter;

public class TelevisionRunner {

	public static void main(String[] args) {
		Television television = new Television();
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
		System.out.println("==========================================");
		TelevisionAlter televisionAlter = new TelevisionAlter();
		televisionAlter.AlterTelevision(television);
	}

}
