package com.xworkz.depository.boot;

import com.xworkz.depository.dto.SoldierDTO;
import com.xworkz.depository.repository.SoldiersRepo;
import com.xworkz.depository.repository.SoldiersRepoImpl;
import com.xworkz.depository.services.SoldierServiceImpl;

public class SoldiersRunner {

	public static void main(String[] args) {
		//SoldierDTO dto = new SoldierDTO("Varun", 7, 5, "India", "PDIT");
		SoldierDTO dto = new SoldierDTO("Varun", 7, 5, "India", "PDIT") {
		};
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldiersRepo repo = new SoldiersRepoImpl();
		service.setSoldiersRepo(repo);
		service.validateAndSave(dto);
	}

}
