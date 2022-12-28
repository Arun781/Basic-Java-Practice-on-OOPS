package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.CalendarDTO;
import com.xworkz.collections.dto.PlaceDTO;

public class CalendarRunner {

	public static void main(String[] args) {
		CalendarDTO calendarDTO0 = new CalendarDTO("Times Of India",2022D, 50);
		CalendarDTO calendarDTO1 = new CalendarDTO("Indian Of India",2022D, 50);
		CalendarDTO calendarDTO2 = new CalendarDTO("Chinese",2022D, 50);
		CalendarDTO calendarDTO3 = new CalendarDTO("Julian Calendars",2022D, 50);
		CalendarDTO calendarDTO4 = new CalendarDTO("Germany",2022D, 50);
		CalendarDTO calendarDTO5 = new CalendarDTO("Times of US",2022D, 50);
		
		boolean equals = calendarDTO0.equals(calendarDTO5);
		System.out.println(calendarDTO0.getYear().equals(calendarDTO5.getName()));
		
		System.err.println(System.lineSeparator());
		System.out.println("_____________________________________________"+equals);
		Collection<CalendarDTO> ref = new ArrayList<CalendarDTO>();
		ref.add(calendarDTO0);
		ref.add(calendarDTO1);
		ref.add(calendarDTO2);
		ref.add(calendarDTO3);
		boolean contains = ref.contains(calendarDTO5);
		System.out.println("The Contains:-"+contains);

	}

}
