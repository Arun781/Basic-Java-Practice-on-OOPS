package com.xworkz.developer.constant;
public enum CanaraBank {
	BALANCE_1("SBI",25,9620753670l),BALANCE_2("Canara",55,9945682265l),BALANCE_3("Kotak",150,300000l);
	
	public String savingBalance;
	public int currentBalance;
	public long personalBalance;
	
	private CanaraBank(String savingBalance,int currentBalance,long personalBalance) 
	
	{
		this.savingBalance=savingBalance;
		this.currentBalance=currentBalance;
		this.personalBalance=personalBalance;
	}
}