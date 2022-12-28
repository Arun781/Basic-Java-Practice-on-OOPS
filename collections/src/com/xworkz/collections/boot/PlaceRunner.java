package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO placeDTO = new PlaceDTO("Goa","Goa","India");
		PlaceDTO placeDT1 = new PlaceDTO("Bangaloure","Karnataka","India");
		PlaceDTO placeDT2 = new PlaceDTO("Hyderbad","telangana","India");
		PlaceDTO placeDT3 = new PlaceDTO("Vizag","AndraPradesh","India");
		PlaceDTO placeDT4 = new PlaceDTO("Vijayanagar","Karnataka","India");
		
		boolean equals = placeDTO.equals(placeDT4);
		System.out.println(placeDTO.getCountry().equals(placeDT4.getCountry()));
		
		System.err.println(System.lineSeparator());
		System.out.println("_____________________________________________"+equals);
		Collection<PlaceDTO> ref = new ArrayList<PlaceDTO>();
		ref.add(placeDTO);
		ref.add(placeDT1);
		ref.add(placeDT2);
		ref.add(placeDT3);
		boolean contains = ref.contains(placeDT4);
		System.out.println("The Contains:-"+contains);
	}

}
