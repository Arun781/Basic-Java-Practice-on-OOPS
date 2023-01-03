package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.HolidayDTO;

public class HolidayRunner{
	public static void main (String [] arg) {
		
		HolidayDTO ref0 = new HolidayDTO("Dasara Holidays", 30, "Going to home");
		HolidayDTO ref1 = new HolidayDTO("Deepawali Holidays", 2, "Going to home");
		HolidayDTO ref2 = new HolidayDTO("New Year Holidays", 30, "Going to home");
		HolidayDTO ref3 = new HolidayDTO("Yugadi Holiday", 2, "Going to home");
		HolidayDTO ref4 = new HolidayDTO("Weekend Holidays", 2, "Going to home");
		
		
		boolean equals = ref0.equals(ref4);
		System.out.println(ref0.getPlannings().equals(ref4.getPlannings()));
		
		System.err.println(System.lineSeparator());
		System.out.println("_____________________________________________"+equals);
		Collection<HolidayDTO> ref = new ArrayList<HolidayDTO>();
		ref.add(ref0);
		ref.add(ref1);
		ref.add(ref2);
		ref.add(ref3);
		boolean contains = ref.contains(ref3);
		System.out.println("The Contains:-"+contains);
	}
	
}
