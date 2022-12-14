package com.xworkz.crud.repository;



import com.xworkz.crud.dto.IPL;
import com.xworkz.crud.exception.ArrayisFullcantaddMore;

public interface IPLRepository {
	boolean create(IPL ipl) throws ArrayisFullcantaddMore;
	
	default int total() {
		return 0;
	}
}
