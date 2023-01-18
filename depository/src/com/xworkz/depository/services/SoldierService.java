package com.xworkz.depository.services;

import com.xworkz.depository.dto.SoldierDTO;

public interface SoldierService {

	boolean validateAndSave(SoldierDTO dto);
}
