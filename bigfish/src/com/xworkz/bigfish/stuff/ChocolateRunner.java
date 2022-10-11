package com.xworkz.bigfish.stuff;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Declaring the Chocolate name,brand,price,and the flavour");
		Chocolate source=new Chocolate();
		System.out.println(source.nameOfChocolate);
		System.out.println(source.flavourChocolate);
		System.out.println(source.brandOfChocolate);
		System.out.println(source.priceOfChocolate);
		source.brandOfChocolate="Nestle Chocolates";
		source.flavourChocolate="Chocolates";
		source.nameOfChocolate="Dark";
		source.priceOfChocolate=100;
		System.out.println(source.nameOfChocolate);
		System.out.println(source.flavourChocolate);
		System.out.println(source.brandOfChocolate);
		System.out.println(source.priceOfChocolate);
				
		
	}

}
