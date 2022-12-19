package com.xworkz.crud.service;

import com.xworkz.crud.dto.BikeDTO;
import com.xworkz.crud.exception.InvalidBuildingException;

public interface BikeService {
	boolean validateAndSave(BikeDTO bikeDTO) throws InvalidBuildingException;
}
