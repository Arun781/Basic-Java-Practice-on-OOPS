package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IPL;

public interface IPLRepository {
	boolean create(IPL ipl);
	
	default int total() {
		return 0;
	}
}
