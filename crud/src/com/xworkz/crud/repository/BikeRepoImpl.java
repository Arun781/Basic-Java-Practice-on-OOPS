package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BikeDTO;

public class BikeRepoImpl implements BikeRepo {
	private BikeDTO[] bike = new BikeDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean saveData(BikeDTO bikedto) {
		System.out.println("Running the save in BikeRepoImpl" + bikedto);
		if (this.currentIndex >= bike.length) {

		}
		this.bike[currentIndex] = bikedto;
		System.out.println("Saved to" + bikedto + "at index" + currentIndex);
		this.currentIndex++;
		return true;
	}

}
