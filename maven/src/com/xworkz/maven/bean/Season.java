package com.xworkz.maven.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private String startingMonth;
	private Double durationOfSeason;

	public Season() {
		System.out.println("Creating default cons in Spring");
	}
	@Value("Moonsoon")
	public void setName(String name) {
		this.name = name;
	}
	@Value("July to Mid-Sep")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	@Value("2")
	public void setDurationOfSeason(Double durationOfSeason) {
		this.durationOfSeason = durationOfSeason;
	}
	public String getName() {
		return name;
	}
	public String getStartingMonth() {
		return startingMonth;
	}
	public Double getDurationOfSeason() {
		return durationOfSeason;
	}
	
}
