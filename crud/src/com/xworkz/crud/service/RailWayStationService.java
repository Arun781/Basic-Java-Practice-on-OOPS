package com.xworkz.crud.repository;

import com.xworkz.crud.dto.RailWayStationDTO;
import com.xworkz.crud.exception.InvalidRailWayStationException;

public interface RailWayStationService {
	boolean validationRailWayStation(RailWayStationDTO railWayStation) throws InvalidRailWayStationException;
}
