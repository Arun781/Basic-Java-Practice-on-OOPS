package com.xworkz.crud.repository;

import com.xworkz.crud.dto.RailWayStationDTO;
import com.xworkz.crud.exception.StorageFullExceptions;

public class RailWayStationRepositoryImpl implements RailWayStationRepository {
	public RailWayStationRepositoryImpl() {
		super();
		System.out.println("Running the no Arguments RailWayStationRepositoryImpl");
		System.err.println("_______________________________________________");
	}

	private RailWayStationDTO[] railway = new RailWayStationDTO[5];
	private int liveIndex = 0;

	@Override
	public boolean save(RailWayStationDTO railWayStationDTO) {
		System.out.println("Running the save RailWayStationRepository :-" + railWayStationDTO);
		if(this.liveIndex>=railway.length) {
			System.err.println("RailWayStationDTO is exceeding Size:-"+railway);
			throw new StorageFullExceptions("Storage is full max is limited:-"+railWayStationDTO);
		}
		this.railway[liveIndex] = railWayStationDTO;
		System.out.println("Saved to"+railWayStationDTO+"at Index"+liveIndex);
		this.liveIndex++;
		return true;
	}

}
