package com.xworkz.crud.service;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.InvalidTheaterException;
import com.xworkz.crud.repository.TheaterRepository;
import com.xworkz.crud.repository.TheaterRepositoryImpl;

public class TheaterDTORunner {

	public static void main(String[] args) {
		TheaterDTO theaterDTO = new TheaterDTO("PVR32145HYD", "PVR Cinemas", "PVR Brand ", 150D, "MAhesh Babu", LocalDateTime.now(),"Mahesh",LocalDateTime.now());
		TheaterRepository repository = new TheaterRepositoryImpl();
		TheaterService theaterService= new TheaterServiceImpl(repository);
		try {
			theaterService.validation(theaterDTO);
		}catch(InvalidTheaterException e) {
			e.printStackTrace();
		}

	}

}
