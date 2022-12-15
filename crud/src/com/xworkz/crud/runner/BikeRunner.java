package com.xworkz.crud.runner;

import com.xworkz.crud.constant.BrandName;
import com.xworkz.crud.constant.ColurName;
import com.xworkz.crud.dto.BikeDTO;
import com.xworkz.crud.repository.BikeRepo;
import com.xworkz.crud.repository.BikeRepoImpl;
import com.xworkz.crud.service.BikeServiceImpl;

public class BikeRunner {

	public static void main(String[] args) {
		BikeDTO bikeDTO = new BikeDTO("Java", BrandName.Royal_Enfield, 50000D, ColurName.Black, null, null, null, null);
		BikeRepo bikerepo=new BikeRepoImpl();
		BikeServiceImpl bikeServiceImpl = new BikeServiceImpl(bikerepo);
		boolean success = bikeServiceImpl.validateAndSave(bikeDTO);
		System.out.println("Bikes is succes:-"+success);
		
	}

}
