package com.xworkz.crud.service;

import com.xworkz.crud.dto.IPL;
import com.xworkz.crud.exception.ArrayisFullcantaddMore;
import com.xworkz.crud.repository.IPLRepository;


public abstract class IPLRepositoryImplements implements IPLRepository {
	private IPL[] ipl = new IPL[10];
	private int currentIndex = 0;
	
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