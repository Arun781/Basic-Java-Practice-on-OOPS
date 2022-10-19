package com.xworkz.view.boot;

public class MassTransitsRunner {

	public static void main(String[] args) {
		String [] visit = {"Araku Vally","Goa","ChikaMangalore","Kolar"};
		String [] trains = {"Rajdhani Express","Jan Shatabdi Express","Duronto Express"};
		String [] food = {"Salas","SandWich","Bread","Chicken","fish"};
		String [] mobile = {"Redmi","SamSung","Nokis","Moto","Apple"};
		String [] coach = {"Ravi","Varun","introvert","Arun"};
		String [] includes = {"Fan","TV","WASHRROM","BED"}; 
		MassTransits source = new MassTransits("HampiExpress","Bangalore","Vijayanagar Dist",250,5,visit,trains,food,mobile,coach,includes);
		source.display();
	}
	

}
