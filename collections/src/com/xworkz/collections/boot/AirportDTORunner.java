package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.AirportDTO;

public class AirportDTORunner {

	public static void main(String[] args) {
		
		AirportDTO dto0 = new AirportDTO("KSR Airport","Bangaloure","India");
		AirportDTO dto1 = new AirportDTO("GMR Hyderabad International Airport ","Hyderbad","India");
		AirportDTO dto2 = new AirportDTO("Chhatrapati Shivaji Maharaj International Airport","Mumbai","India");
		AirportDTO dto3 = new AirportDTO("Madras International Meenambakkam Airport","Chennai","India");
		AirportDTO dto5 = new AirportDTO("Visakhapatnam Airport","Vizag","India");
		AirportDTO dto6 = new AirportDTO("HUBBALLI AIRPORT (HBX)","Hubli","India");
		
		boolean equals = dto0.equals(dto6);
		System.out.println(dto0.getCounsil().equals(dto6.getCounsil()));
		
		System.err.println(System.lineSeparator());
		System.out.println("_____________________________________________"+equals);
		Collection<AirportDTO> ref = new ArrayList<AirportDTO>();
		ref.add(dto0);
		ref.add(dto1);
		ref.add(dto2);
		ref.add(dto3);
		boolean contains = ref.contains(dto6);
		System.out.println("The Contains:-"+contains);
	}

}
