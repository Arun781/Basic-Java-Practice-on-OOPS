package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.InvalidTheaterException;

public interface TheaterService {
	boolean validation(TheaterDTO theaterDTO) throws InvalidTheaterException;
}
