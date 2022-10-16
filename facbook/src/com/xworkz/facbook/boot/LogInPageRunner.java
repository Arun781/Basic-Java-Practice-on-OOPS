package com.xworkz.facbook.boot;

public class LogInPageRunner {

	public static void main(String[] args) {
		LogInPage ref=new LogInPage();
		System.out.println("Initializing the infromation related to log in page");
		ref.name="Arun Veerapur";
		ref.num=9620753670l;
		ref.emailId="arunbv9999@gmail.com";
		ref.password=107030896l;
		ref.forgotPassword=0505d;
		ref.oneTimePassword=9945682265l;
		ref.secuityQuestin="Your Pet Name";
		ref.gender='M';
		ref.place="Hosapete";
		System.out.println(ref.name);
		System.out.println(ref.num);
		System.out.println(ref.emailId);
		System.out.println(ref.password);
		System.out.println(ref.forgotPassword);
		System.out.println(ref.oneTimePassword);
		System.out.println(ref.secuityQuestin);
		System.out.println(ref.gender);
		System.out.println(ref.place);
		
		LogInPage ref1=new LogInPage("Arun",2536412425l);
		System.out.println(ref1.name);
		System.out.println(ref1.num);
		System.out.println(ref1.emailId);
		System.out.println(ref1.password);
		System.out.println(ref1.forgotPassword);
		System.out.println(ref1.oneTimePassword);
		System.out.println(ref1.secuityQuestin);
		System.out.println(ref1.gender);
		System.out.println(ref1.place);
		
		LogInPage ref2=new LogInPage(9620753670l,"arunbv6464@gmail.com","Varun",985547321l);
		System.out.println(ref2.name);
		System.out.println(ref2.num);
		System.out.println(ref2.emailId);
		System.out.println(ref2.password);
		System.out.println(ref2.forgotPassword);
		System.out.println(ref2.oneTimePassword);
		System.out.println(ref2.secuityQuestin);
		System.out.println(ref2.gender);
		System.out.println(ref2.place);
		
		LogInPage ref3=new LogInPage(9620753670l,"introvert123@gmail.com",52525d,698547854l,"Pet Name");
		System.out.println(ref3.name);
		System.out.println(ref3.num);
		System.out.println(ref3.emailId);
		System.out.println(ref3.password);
		System.out.println(ref3.forgotPassword);
		System.out.println(ref3.oneTimePassword);
		System.out.println(ref3.secuityQuestin);
		System.out.println(ref3.gender);
		System.out.println(ref3.place);
	}
}
