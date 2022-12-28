package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedList;

public class CouponsRunner {

	public static void main(String[] args) {
		String coupon1 = "Swiggy150";
		String coupon2 = "FirstNew";
		String coupon3 = "YearBlost";
		String coupon4 = "FirstCar";
		String coupon5 = "SuperHit";
		String coupon6 = "SpecialTue";
		String coupon7 = "SuperFry";
		String coupon8 = "NewoutLook";
		String coupon9 = "BigMega";
		String coupon10 = "FirstTravell";
		String coupon11 = "PrimeKaDamak";
		String coupon12 = "BdayBash";
		String coupon13 = "Super30";
		
		Collection <String> ref = new LinkedList();
		ref.add(coupon1);
		ref.add(coupon2);
		ref.add(coupon3);
		ref.add(coupon4);
		ref.add(coupon5);
		ref.add(coupon6);
		ref.add(coupon7);
		ref.add(coupon8);
		ref.add(coupon9);
		ref.add(coupon10);
		ref.add(coupon11);
		ref.add(coupon12);
		ref.add(coupon13);
		
		System.out.println(ref.size());
		ref.clear();
		System.out.println("After clearing and Adding");
		ref.add(coupon1);
		ref.add(coupon2);
		ref.add(coupon3);
		ref.add(coupon4);
		ref.add(coupon5);
		ref.add(coupon6);
		ref.add(coupon7);
		ref.add(coupon8);
		ref.add(coupon9);
		System.out.println(ref.size());

	}

}
