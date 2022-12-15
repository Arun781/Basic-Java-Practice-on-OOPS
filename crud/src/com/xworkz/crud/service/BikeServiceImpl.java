package com.xworkz.crud.service;

import com.xworkz.crud.constant.BrandName;
import com.xworkz.crud.constant.ColurName;
import com.xworkz.crud.dto.BikeDTO;
import com.xworkz.crud.repository.BikeRepo;

public class BikeServiceImpl implements BikeService {
	private BikeRepo bikedto;

	public BikeServiceImpl(BikeRepo bikedto) {
		this.bikedto = bikedto;
	}

	@Override
	public boolean validateAndSave(BikeDTO bikeDTO) {
		String name = bikeDTO.getName();
		BrandName brandName = bikeDTO.getBrandName();
		Double costOfBike = bikeDTO.getCostOfBike();
		ColurName colur = bikeDTO.getColur();
		boolean Validname = false;
		boolean validcostOfBike = false;
		boolean validbrandName = false;
		boolean validcolur = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Bike name is Valid:-" + name);
			Validname = true;
		} else {
			System.out.println("Bike name is not Valid:-" + name);
		}
		if (costOfBike != null && costOfBike > 50000 && costOfBike < 5000000) {
			System.out.println("costOfBike  is Valid:-" + costOfBike);
			validcostOfBike = true;
		} else {
			System.out.println("costOfBike  is not Valid:-" + costOfBike);
		}
		if (brandName != null) {
			System.out.println("brandName is Valid:-" + brandName);
			validbrandName = true;
		} else {
			System.out.println("brandName is not Valid:-" + brandName);
		}
		if (colur != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("colur is Valid:-" + colur);
			validcolur = true;
		} else {
			System.out.println("colur is not Valid:-" + colur);
		}

		if (validcolur && validbrandName && validcostOfBike && Validname) {
			System.out.println("Bike Service is Valid Can save the data to repositoty");
			boolean saved = this.bikedto.saveData(bikeDTO);
			System.err.println("Bike dto is saved to bike repository" + saved);
		}
		return true;
	}

}
