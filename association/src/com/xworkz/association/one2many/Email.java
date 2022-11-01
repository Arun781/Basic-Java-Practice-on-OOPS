package com.xworkz.association.one2many;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public Email(String id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public void setcompany(Company company) {
		this.company = company;
	}
	public void ShowOff() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		if (company != null) {
			company.ShowOff();
		}
	}
}
