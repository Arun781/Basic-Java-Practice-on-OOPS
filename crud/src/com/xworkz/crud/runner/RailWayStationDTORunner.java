package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.RailWayStationDTO;
import com.xworkz.crud.exception.InvalidRailWayStationException;
import com.xworkz.crud.repository.RailWayStationRepository;
import com.xworkz.crud.repository.RailWayStationRepositoryImpl;
import com.xworkz.crud.service.RailWayStationService;
import com.xworkz.crud.service.RailWayStationServiceImpl;

public class RailWayStationDTORunner {

	public static void main(String[] args) {
		RailWayStationDTO railWayStationDTO = new RailWayStationDTO("KSR R,Station bang", 10D, "Bangaloure", 10,"Govt",LocalDateTime.now(),"Ruling Govt",LocalDateTime.now());
		RailWayStationRepository railWayStationRepository=new RailWayStationRepositoryImpl();
		RailWayStationService railWayStationService = new RailWayStationServiceImpl(railWayStationRepository);
		try {
			railWayStationService.validationRailWayStation(railWayStationDTO);
		}catch(InvalidRailWayStationException e) {
			e.printStackTrace();
		}
	}

}
