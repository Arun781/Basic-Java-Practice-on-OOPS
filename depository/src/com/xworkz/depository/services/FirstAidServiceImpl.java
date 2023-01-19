package com.xworkz.depository.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.depository.dto.FirstAidDTO;
import com.xworkz.depository.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	public FirstAidRepo firstAidRepo;
	public Validator validator;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		super();
		this.firstAidRepo = firstAidRepo;
	}

	@Autowired
	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("validating the FirstAidDTO");
		System.out.println("DTO:-" + dto);
		Set<ConstraintViolation<FirstAidDTO>> validation = validator.validate(dto);
		if (!validation.isEmpty()) {
			System.out.println("The error found in FirstAid");
			validation.forEach(aa -> System.out.println(aa.getMessage()));
			return false;
		} else {
			System.out.println("The error not found in FirstAid");
			boolean save = firstAidRepo.save(dto);
			System.out.println("The data is saved" + save);
			return true;
		}
	}

}
