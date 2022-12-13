package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.repository.AbstractAudit;

public class IPL extends AbstractAudit{
	private String teamName;
	private String captainName;
	private boolean owneralive;
	private double purse;
	private int wins;
	private int defeats;
	
	
	public IPL() {
		System.out.println("Creating IPL the no Arguments Cons");
	}


	@Override
	public String toString() {
		return "IPL [teamName=" + teamName + ", captainName=" + captainName + ", owneralive=" + owneralive + ", purse="
				+ purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCaptainName() {
		return captainName;
	}


	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}


	public boolean isOwneralive() {
		return owneralive;
	}


	public void setOwneralive(boolean owneralive) {
		this.owneralive = owneralive;
	}


	public double getPurse() {
		return purse;
	}


	public void setPurse(double purse) {
		this.purse = purse;
	}


	public int getWins() {
		return wins;
	}


	public void setWins(int wins) {
		this.wins = wins;
	}


	public int getDefeats() {
		return defeats;
	}


	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}


	public void setCreatedDate(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		
	}


	public void setUpdatedDate(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	

}
