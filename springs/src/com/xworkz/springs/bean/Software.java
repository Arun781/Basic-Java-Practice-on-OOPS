package com.xworkz.springs.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("SoftwareName")
	private String Softwarename;
	@Autowired
	@Qualifier("3.5")
	private Double version;
	@Autowired
	@Qualifier("SoftwareDevelopedBy")
	private String developedBy;
	@Autowired
	@Qualifier("LocalDate")
	private LocalDateTime date;
	@Autowired
	@Qualifier("free")
	private boolean free;

	public Software() {
		System.out.println("Created Software using no arg cons...");
	}

	@Override
	public String toString() {
		return "Software [Softwarename=" + Softwarename + ", version=" + version + ", developedBy=" + developedBy + ", date=" + date
				+ ", free=" + free + "]";
	}

}
