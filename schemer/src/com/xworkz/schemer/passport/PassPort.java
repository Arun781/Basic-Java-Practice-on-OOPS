package com.xworkz.schemer.passport;

public class PassPort {
	public long numberOfPassPort;
	public String nameOnPassPort;
	public double price;
	public long expiryDate;
	public String Country;
	public double issueDate;
	
	public PassPort(long numberOfPassPort,String nameOnPassPort )
	{
		this.numberOfPassPort=numberOfPassPort;
		this.nameOnPassPort=nameOnPassPort;
	}
	public PassPort(double price,long expiryDate)
	{
		this.price=price;
		this.expiryDate=expiryDate;
	}
	public PassPort(String Country,double issueDate)
	{
		this.Country=Country;
		this.issueDate=issueDate;
	}
}
