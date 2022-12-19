package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.InvalidPlaceException;
import com.xworkz.crud.repository.PlaceRepository;
import com.xworkz.crud.repository.PlaceRepositoryImpl;
import com.xworkz.crud.service.PlaceService;
import com.xworkz.crud.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO placeDTO = new PlaceDTO("Vijayanagar", 15700D, "VijayaNgar Dist", "VijayaNagar Taluk","Karnataka","Anath Singh",LocalDateTime.now(),"Anadh Singh",LocalDateTime.now());
		PlaceRepository placeRepository = new PlaceRepositoryImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepository);
		try {
			placeService.validateData(placeDTO);
		}catch(InvalidPlaceException e){
			e.printStackTrace();
		}
	}

}
