package com.xworkz.association.one2many;

public class PersonRuuner {

	public static void main(String[] args) {
		
		Person person = new Person("jhon");
		State state = new State("Karanataka",32,30, "Bangalore");
		City city = new City("Vijayanagar","H.B.Halli",true,"Gottilaa");
		Country country = new Country("india","Null", 3.287,"Delhi");
		
		Location location = new Location(35, "Ballari");
		location.setLocations(city, state, country);
		
		Address address = new Address();
		address.setlocation(location);
		
		Company company = new Company("X-workz","Omkar");
		company.setaddres(address);
		
		Job job = new Job(2.500000, "Software Developer", 1);
		job.setCompany(company);
		
		person.name = ":-Arun";
		Email email = new Email("Varun", "run0723@AR", 6363445517l);
		Email email1 = new Email("Shivu Veerapur", "arun0723@AR", 9945682265l);
		Email email2 = new Email("Shreyan Veerapur", "Shrey25@AR", 6655224411l);
		Email email3 = new Email("Chethan Veerapur", "arun0723@AR",7892773176l);
		Email[] array = { email, email1,email2,email3 };
		person.Setemail(array);
		person.Setjob(job);		
		person.Display();
	}

}
