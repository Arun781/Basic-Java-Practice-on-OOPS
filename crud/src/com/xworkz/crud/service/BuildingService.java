package com.xworkz.crud.service;

import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.InvalidBuildingException;

public interface BuildingService {
	
	boolean validateAndSave(BuildingDTO buildingDTO) throws InvalidBuildingException;

}
