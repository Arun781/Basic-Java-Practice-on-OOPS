package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.InvalidTheaterException;
import com.xworkz.crud.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {
	
	private TheaterRepository theaterRepository;
	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		System.out.println("Running the TheaterServiceImpl parameterised constructor");
		this.theaterRepository=theaterRepository;
	}
	@Override
	public boolean validation(TheaterDTO theaterDTO) throws InvalidTheaterException {
		System.out.println("Running the TheaterServiceImplto validation:-"+theaterDTO);
		String id = theaterDTO.getId();
		String name=theaterDTO.getName();
		String brand=theaterDTO.getBrand();
		Double seats=theaterDTO.getSeats();
		
		boolean invalidId=false;
		boolean invalidName=false;
		boolean invalidBrand=false;
		boolean invalidSeats=false;
		
		if(id!=null && id.length()>=4 && id.length()<=20) {
			System.out.println("The Id is valid :-"+id);
			invalidId = true;
		}else {
			System.out.println("The Id is invalid:-"+id);
		}
		if(name!=null && name.length()>=4 && name.length()<=20) {
			System.out.println("The name is valid :-"+name);
			invalidName = true;
		}else {
			System.out.println("The name is invalid:-"+name);
		}
		if(brand!=null && brand.length()>=4 && brand.length()<=20) {
			System.out.println("The brand is valid :-"+brand);
			invalidBrand = true;
		}else {
			System.out.println("The brand is invalid:-"+brand);
		}
		if(seats>=20 && seats<=300) {
			System.out.println("The seats is valid :-"+seats);
			invalidSeats = true;
		}else {
			System.out.println("The seats is invalid:-"+seats);
		}
		if(invalidId && invalidName && invalidBrand && invalidSeats) {
			System.out.println("The TheaterServiceImpl is varified and ready to save the theaterDTO to theaterrepo:-"+theaterDTO);
			boolean saved = theaterRepository.saveData(theaterDTO);
			System.out.println("The theaterDTO is saved to theater Repo"+saved);
			return true;
		}
		throw new InvalidTheaterException("The 	data is invalid check and verify the data"+theaterDTO);
		
	}

}
