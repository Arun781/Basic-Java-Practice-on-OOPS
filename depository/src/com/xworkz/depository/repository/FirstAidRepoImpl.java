package com.xworkz.depository.repository;

import org.springframework.stereotype.Component;

import com.xworkz.depository.dto.FirstAidDTO;
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO firstAidDTO) {
		System.out.println("Data is ready to save");
		return true;
	}

	

}
