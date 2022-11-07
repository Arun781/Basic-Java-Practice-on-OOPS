package com.xworkz.casting.runner;

import com.xworkz.casting.main.*;

public class DoctorRunner {

	public static void main(String[] args) {
		Doctor obj = new Dentist();
		System.out.println("The Dr Name:-"+obj.name);
		System.out.println("The Dr salary is "+obj.salary);
		System.out.println("The Dr Specialist in:-"+obj.specialist);
		System.out.println("The Gender of the Dr is:-"+obj.gender);
		System.out.println("================================================================");
		Dentist obj1 = (Dentist) obj;// Casting
		System.out.println("The name of the Dentist:-" + obj1.name);
		System.out.println("The Dr.Veeresh place is :-" + obj1.place);
		System.out.println("================================================================");
		Doctor ent = new Ent();
		Ent obj2 = (Ent) ent;// Casting
		System.out.println("The Ent Doctor Name is :-" + obj2.name);
		System.out.println("Specialization in :-" + obj2.specialist);
		System.out.println("================================================================");
		Doctor cardiologists = new Cardiologists();// Casting
		Cardiologists obj3 = (Cardiologists) cardiologists;
		System.out.println("The cardiologists name :-" + obj3.name);
		System.out.println("The cardiologists specialiazation in :-" + obj3.specialist);
		System.out.println("================================================================");
	}

}
