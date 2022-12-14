package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.War;
import com.xworkz.crud.repository.WarRepositary;
import com.xworkz.crud.repository.WarRepositaryImpl;

public class WarRepositaryRunner {

	public static void main(String[] args) {
		WarRepositary repo = new WarRepositaryImpl();
		War war = new War();
		war.setEndDate(2023);
		war.setName("Russia vs Ukraine War");
		war.setNoOfDeaths(25000);
		war.setStartDate(2022);
		war.setStartedBy("Russia");
		war.setWonBy("Russia");
		war.setStartedWith("Ukraine");
		war.setCreatedBy("Arun");
		war.setUpdatedBy("Arun Veerapur");
		war.setCreatedBy("Prashanth");
		war.setCreatedDate(LocalDateTime.now());
		war.setFindBy("MasssMaharaj");
		repo.creating(war);
		repo.tempwar("Russia");
	}
}
