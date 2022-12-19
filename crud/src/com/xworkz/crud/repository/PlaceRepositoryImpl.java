package com.xworkz.crud.repository;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.StorageFullExceptions;

public class PlaceRepositoryImpl implements PlaceRepository {
	public PlaceRepositoryImpl() {
		System.out.println("Running the no arguments PlaceRepositoryImpl");
		System.err.println("___________________________________________________________________________________________________________________________");
	}
	private PlaceDTO [] place = new PlaceDTO[5];
	private int liveIndex=0;
	@Override
	public boolean storingData(PlaceDTO placeDTO) {
		System.out.println("Running the PlaceRepository to storing data :-"+placeDTO);
		if(this.liveIndex>=this.place.length) {
			System.out.println("PlaceRepo is exceeding the Size:-"+place);
			throw new StorageFullExceptions("Storage is full maz size is needed:-"+placeDTO);
		}
		this.place[liveIndex]=placeDTO;
		System.out.println("Saved to"+placeDTO+"at index"+liveIndex);
		this.liveIndex++;
		return false;
	}

}
