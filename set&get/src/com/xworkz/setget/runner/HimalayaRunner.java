package com.xworkz.setget.runner;

import com.xworkz.setget.classes.Himalaya;
import com.xworkz.setget.classes.HimalayaModify;

public class HimalayaRunner {

	public static void main(String[] args) {
		Himalaya himalaya = new Himalaya();
		System.out.println(himalaya.getProductName());
		System.out.println(himalaya.getManufacturingBy());
		System.out.println(himalaya.getModelName());
		System.out.println(himalaya.getQuantity());
		System.out.println(himalaya.getPrice());
		System.out.println(himalaya.getFaceWashType());
		System.out.println(himalaya.getIngredientType());
		System.out.println(himalaya.getMaximumShelfLife());
		System.out.println(himalaya.getAppliedFor());
		System.out.println(himalaya.getSkinType());
		System.out.println(himalaya.getContainerType());
		System.out.println("=======================================");
		HimalayaModify himalayaModify = new HimalayaModify();
		himalayaModify.modifyingHimalaya(himalaya);
		System.out.println(himalaya);
	}

}
