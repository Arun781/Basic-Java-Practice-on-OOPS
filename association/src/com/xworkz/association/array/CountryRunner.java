package com.xworkz.association.array;

import com.xworkz.association.constant.Gender;

public class CountryRunner {

	public static void main(String[] args) {
		Country country = new Country("India");
		
		President president = new President("Manmohan",5,Gender.Male);
		country.setPresident(president);
		Name name = new Name("Manmohan Singh");
		Name name1 = new Name("Manmohan");
		
		City city = new City(name, "Delhi", 45645.9);
		City city1 = new City(name1, "Bangalore", 56434.8);
		City[] array = { city, city1 };
		country.setCities(array);
		country.Showoff();
		
	}

}
