package com.xworkz.crud.repository;

import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.StorageFullExceptions;

public class TheaterRepositoryImpl implements TheaterRepository {
	private TheaterDTO [] theater = new TheaterDTO[5];
	private int theoreticalPriceIndex;
	@Override
	public boolean saveData(TheaterDTO theaterDTO) {
		System.out.println("Ruuning the TheaterDTO saveData"+theaterDTO);
		if(this.theoreticalPriceIndex>=this.theater.length) {
			System.out.println("Cannot add more theaters");
			throw new StorageFullExceptions("Storage is full max size is enough"+theaterDTO);
		}
		this.theater[this.theoreticalPriceIndex]=theaterDTO;
		System.out.println("Saved theaterDTO into index"+this.theoreticalPriceIndex);
		this.theoreticalPriceIndex++;
		return false;
	}

}
