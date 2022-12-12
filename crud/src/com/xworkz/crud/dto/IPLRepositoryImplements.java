package com.xworkz.crud.dto;

public class IPLRepositoryImplements {
	private IPL[] ipl = new IPL[10];
	private int currentIndex = 0;
	
	public boolean create(IPL ipl) {
		System.out.println("running create of IPL"+ipl);
		if(this.currentIndex>this.ipl.length) {
			System.err.println("Sixe exceeded cannot add moew ipl");
			return false;
		}
		this.ipl[this.currentIndex]=ipl;
		System.out.println("Saved"+ipl+"in index"+this.currentIndex++);
		this.currentIndex++;
		return false;
		
	}
}
