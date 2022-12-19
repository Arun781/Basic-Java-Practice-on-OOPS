package com.xworkz.crud.service;

import com.xworkz.crud.constant.Parking;
import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.InvalidBuildingException;
import com.xworkz.crud.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingRepository repository;

	public BuildingServiceImpl(BuildingRepository repository) {
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(BuildingDTO buildingDTO) throws InvalidBuildingException {
		System.out.println("Running the BuildingDTO:-"+buildingDTO);
		double no = buildingDTO.getNo();
		String name = buildingDTO.getName();
		int floors = buildingDTO.getFloors();
		boolean lift = true; 
		Parking parking = buildingDTO.getParking();
		String type = buildingDTO.getType();

		boolean invalidNo = false;
		boolean invalidname = false;
		boolean invalidfloors = false;
		boolean invalidlift = false;
		boolean invalidparking = false;
		boolean invalidtype = false;

		if (no >= 10 && no <= 15) {
			System.out.println("The no of building is valid:-" + no);
			invalidNo = true;
		} else {
			System.out.println("The no of building is not valid:-" + no);
		}

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("The name of building is valid:-" + name);
			invalidname = true;
		} else {
			System.out.println("The name of building is not valid:-" + name);
		}

		if (floors > 3 && floors < 10) {
			System.out.println("The floors of building is valid:-" + floors);
			invalidfloors = true;
		} else {
			System.out.println("The floors of building is not valid:-" + floors);
		}

		if (type != null && type.length() >= 3 && type.length() <= 20) {
			System.out.println("The type of building is valid:-" + type);
			invalidtype = true;
		} else {
			System.out.println("The type of building is not valid:-" + name);
		}
		if(parking!=null) {
			System.out.println("The parking of building is valid:-" + parking);
			invalidparking = true;
		}else {
			System.out.println("The parking of building is not valid:-" + parking);
		}
		if(lift==true) {
			System.out.println("The lift of building is valid:-" + lift);
			invalidlift = true;
		}else {
			System.out.println("The lift of building is not valid:-" + lift);
		}
		if (invalidNo && invalidname && invalidfloors && invalidlift && invalidparking && invalidtype) {
			System.out.println("The Building DTO is Valid you can save it too Building Repo:-" + buildingDTO);
			boolean saved = repository.save(buildingDTO);
			System.out.println("The building DTO is saved to Building repo :-" + saved);
			return saved;
		} else {
			throw new InvalidBuildingException("Check the data you have entered :-");
		}

	}

}
