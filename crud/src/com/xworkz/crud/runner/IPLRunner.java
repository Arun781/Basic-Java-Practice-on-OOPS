package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.IPL;
import com.xworkz.crud.dto.IPLRepositoryImplements;

public class IPLRunner {

	public static void main(String[] args) {
		IPLRepositoryImplements iplRepositoryImplements = new IPLRepositoryImplements();
		IPL ipl = new IPL();
		ipl.setCaptainName("Kohil");
		ipl.setTeamName("RCB");
		ipl.setCreatedDate(LocalDateTime.now());
		ipl.setDefeats(137);
		ipl.setOwneralive(true);
		ipl.setPurse(100);
		ipl.setCreatedBy(null);
		ipl.setWins(110);
		iplRepositoryImplements.create(ipl);
		
	}

}
