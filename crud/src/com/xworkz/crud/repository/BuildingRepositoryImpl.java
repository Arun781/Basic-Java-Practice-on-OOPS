package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.StorageFullExceptions;

public class BuildingRepositoryImpl implements BuildingRepository {
	
	private BuildingDTO[] building = new BuildingDTO[5];
	private int liveIndex = 0;
	@Override
	public boolean save(BuildingDTO buildingDTO) {
		System.out.println("Running the BuildingRepositoryImpl:- "+buildingDTO);
		if(this.liveIndex >= this.building.length) {
			System.out.println("Cannot add more Buildings");
			throw new StorageFullExceptions("Storage is full Max Size is needed"+buildingDTO);
		}
		this.building[this.liveIndex]=buildingDTO;
		System.out.println("Saved buildingDTO into index"+this.liveIndex);
		this.liveIndex++;
		return true;
	}
	
	
}
