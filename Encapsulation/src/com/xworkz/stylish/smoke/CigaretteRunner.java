package com.xworkz.stylish.smoke;

public class CigaretteRunner {

	public static void main(String[] args) {
		System.out.println("Declaring the Cigarette information");
		System.out.println("============================================================");
		Cigarette smokeing=new Cigarette();
		smokeing.brand="Balck";
		smokeing.name="dont no";
		smokeing.country="India";
		smokeing.price=25;
		smokeing.quantity=9;
		smokeing.located="Hyderbad";
		smokeing.dateOfManufacture=02072012l;
		smokeing.started="1992";
		System.out.println(smokeing.brand);
		System.out.println(smokeing.name);
		System.out.println(smokeing.country);
		System.out.println(smokeing.price);
		System.out.println(smokeing.quantity);
		System.out.println(smokeing.located);
		System.out.println(smokeing.dateOfManufacture);
		System.out.println(smokeing.started);
		System.out.println("============================================================");
		Cigarette smokeing1=new Cigarette();
		System.out.println("The nicotinContent :-"+smokeing1.nicotinContent);
		System.out.println("The Cigarette flavor is :- "+smokeing1.flavor);
		System.out.println("The harmMassage :-"+smokeing1.harmMassage);
		System.out.println("The environment:-"+smokeing1.environment);
		System.out.println("the cost of the cigarette"+smokeing1.cost);
		System.out.println("tou can order calling this num:-"+smokeing1.orderNum);
		System.out.println("The color of the cigarette:-"+smokeing1.color);
		System.out.println("the paper of the cigarette:-"+smokeing1.paper);
		System.out.println("The cigarette produces the "+smokeing1.produce);
		System.out.println("============================================================");
		smokeing1=smokeing;
		System.out.println(smokeing.brand);
		System.out.println(smokeing.name);
		System.out.println(smokeing.country);
		System.out.println(smokeing.price);
		System.out.println(smokeing.quantity);
		System.out.println(smokeing.located);
		System.out.println(smokeing.dateOfManufacture);
		System.out.println(smokeing.started);	
	}

}
