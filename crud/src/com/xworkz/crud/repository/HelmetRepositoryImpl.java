package com.xworkz.crud.repository;

import com.xworkz.crud.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	private HelmetDTO[] helmet = new HelmetDTO[5];
	private int currentIndex = 0;
	@Override
	public boolean save(HelmetDTO helmetDTO) {
		System.out.println("Running save in HelmetRepositoryImpl"+helmetDTO);
		if(this.currentIndex >= helmet.length) {
			
		}
		this.helmet[currentIndex] =helmetDTO;
		System.out.println("Saved to"+helmetDTO+"at index"+currentIndex);
		this.currentIndex++;
		return true;
	}

}
