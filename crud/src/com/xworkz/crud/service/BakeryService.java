package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.InvalidBakeryException;

public interface BakeryService {
	 boolean validateAndSave(BakeryDTO bakeryDTO) throws InvalidBakeryException;
}
