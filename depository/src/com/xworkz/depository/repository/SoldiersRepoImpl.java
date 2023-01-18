package com.xworkz.depository.repository;

import com.xworkz.depository.dto.SoldierDTO;

public class SoldiersRepoImpl implements SoldiersRepo {
	public SoldiersRepoImpl() {
		System.out.println("Created SoldiersRepoImpl using no arg const......");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("DTO" + dto);
		return true;
	}

}
