package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.StorageFullExceptions;

public class BakeryRepositoryImpl implements BakeryRepository {
	public BakeryRepositoryImpl() {
		super();
		System.out.println("Running the no Arguments BakeryRepositoryImpl");
		System.err.println("_______________________________________________");
	}

	private BakeryDTO[] bakery = new BakeryDTO[5];
	private int liveIndex = 0;

	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running save in BakeryRepositoryImpl" + bakeryDTO);
		if (this.liveIndex >= bakery.length) {
			System.err.println("BakeryRepository is excceding size" + bakery);
			throw new StorageFullExceptions("Storage is full max size is needed:-" + bakeryDTO);
		}
		this.bakery[liveIndex] = bakeryDTO;
		System.out.println("Saved to" + bakeryDTO + "at index" + liveIndex);
		this.liveIndex++;
		return true;
	}

}
