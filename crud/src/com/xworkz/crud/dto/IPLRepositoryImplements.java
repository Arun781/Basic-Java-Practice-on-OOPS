package com.xworkz.crud.dto;

import com.xworkz.crud.repository.IPLRepository;

public class IPLRepositoryImplements implements IPLRepository {
	private IPL[] ipl = new IPL[10];
	private int currentIndex = 0;
	
	@Override
	public boolean create(IPL ipl) throws ArrayisFullcantaddMore {
		System.out.println("running create of IPL"+ipl);
		if(this.currentIndex>=this.ipl.length) {
			System.out.println("Sixe exceeded cannot add moew ipl");
			throw new ArrayisFullcantaddMore();		
		}
			this.ipl[this.currentIndex]=ipl;
			System.out.println("Saved"+ipl+"in index"+this.currentIndex++);
			this.currentIndex++;
		return false;
}
}