package com.xworkz.depository.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.depository.dto.TerroristDTO;

public class TerroristService {
	public TerroristService() {
		System.out.println("Creating TerroristServiceImpl using no-arg const ");
	}

	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("Executing validateAndSave start");
		System.out.println("Dto started" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(a -> System.err.println(a.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		return true;
	}

}
