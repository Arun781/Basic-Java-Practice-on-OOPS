package com.xworkz.depository.services;

import com.xworkz.depository.dto.FirstAidDTO;

public interface FirstAidService {
	boolean validateAndSave(FirstAidDTO dto);
}
