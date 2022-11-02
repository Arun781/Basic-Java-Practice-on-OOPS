package com.xworkz.setget.runner;

import com.xworkz.setget.classes.WashinMachine;
import com.xworkz.setget.classes.WashinMachineAlter;

public class WashinMachineRunner {

	public static void main(String[] args) {
		WashinMachine washinMachine=new WashinMachine();
		System.out.println(washinMachine.getBrand());
		System.out.println(washinMachine.getModelName());
		System.out.println(washinMachine.getFunctionType());
		System.out.println(washinMachine.getWashingCapacity());
		System.out.println(washinMachine.getWashingMethod());
		System.out.println(washinMachine.getHeight());
		System.out.println(washinMachine.getWeight());
		System.out.println(washinMachine.getDepth());
		System.out.println(washinMachine.getWidth());
		System.out.println(washinMachine.getMaxSpinSpeed());
		System.out.println(washinMachine.getPrice());
		System.out.println("==================================");
		WashinMachineAlter washinMachineAlter = new WashinMachineAlter();
		washinMachineAlter.alterWashin(washinMachine);

	}

}
