package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.Parking;
import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.InvalidBuildingException;
import com.xworkz.crud.repository.BuildingRepository;
import com.xworkz.crud.repository.BuildingRepositoryImpl;
import com.xworkz.crud.service.BuildingService;
import com.xworkz.crud.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		BuildingDTO buildingDTO = new BuildingDTO(10, "Klassic LandMark", 4, true, Parking.Four_whealers_Area,
				"Apartment", "Guru", LocalDateTime.now(), "Guru Angadi", LocalDateTime.now());
		BuildingRepository repository = new BuildingRepositoryImpl();
		BuildingService buildingService = new BuildingServiceImpl(repository);
		try {
			buildingService.validateAndSave(buildingDTO);
		} catch (InvalidBuildingException e) {
			e.printStackTrace();
		}
	}

}
