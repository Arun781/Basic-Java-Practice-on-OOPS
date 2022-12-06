package com.xworkz.ExceptionalEvents.Runner;

import com.xworkz.ExceptionalEvents.classes.IntrovertWorld;

public class Rules {

	public static void main(String[] args) {

		IntrovertWorld IntrovertWorld = new IntrovertWorld("arun");
		IntrovertWorld.completedTask();
		IntrovertWorld.setAge(12);
		IntrovertWorld.setName("Arun");
		IntrovertWorld.setWeight(62);
		IntrovertWorld.setHeight(6.2f);
		IntrovertWorld.setPlace("hospet");

		IntrovertWorld.showOff();
		System.out.println(IntrovertWorld.getName());
		System.out.println(IntrovertWorld.getAge());
		System.out.println(IntrovertWorld.getName());
		System.out.println(IntrovertWorld.getHeight());
		System.out.println(IntrovertWorld.getWeight());
		System.out.println(IntrovertWorld.getPlace());

		IntrovertWorld.sleep1();
		IntrovertWorld.uploadedTask();
		IntrovertWorld.vat();
		IntrovertWorld.training();
		IntrovertWorld.paidTax(1000);
		IntrovertWorld.completedTask();
		IntrovertWorld.gst();
		IntrovertWorld.sleep();
		IntrovertWorld.eat();

	}

}
