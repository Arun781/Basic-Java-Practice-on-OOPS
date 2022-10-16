package com.xworkz.facbook.boot;

public class LogInPage {
	public String name;
	public long num;
	public String emailId;
	public long password;
	public double forgotPassword;
	public long oneTimePassword;
	public String secuityQuestin;
	public char gender;
	public String place;

	public LogInPage(String name,long password) {
		this.name=name;
		this.password = password;	
	}
	public LogInPage(long num,String emailId,String name,long password) {
		this(name,password);//reusing Constructor
		this.num = num;
		this.emailId = emailId;
	}
	public LogInPage(long num,String emailId,double forgotPassword,long oneTimePassword,String secuityQuestin) {
		this(emailId,num);
		this.forgotPassword=forgotPassword;
		this.oneTimePassword=oneTimePassword;
		this.secuityQuestin=secuityQuestin;	
	}
	public LogInPage(double forgotPassword,long oneTimePassword,String secuityQuestin,char gender,String place) {
		this(forgotPassword,oneTimePassword,secuityQuestin);
		this.gender=gender;
		this.place=place;	
     }
	public LogInPage(double forgotPassword2, long oneTimePassword2, String secuityQuestin2) {}
	public LogInPage() {}
}
