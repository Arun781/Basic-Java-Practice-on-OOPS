package com.xworkz.association.one2many;

public class Job {
	public double salary;
	public String role;
	public double bond;
	public Company company;
	public Job(double salary, String role, double bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	public void setCompany( Company company) {
		this.company=company;
	}
	public void ShowOff() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		if (company != null) 
		{
			company.ShowOff();
		}
	}

}
