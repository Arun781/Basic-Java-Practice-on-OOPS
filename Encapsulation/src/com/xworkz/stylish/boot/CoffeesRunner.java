package com.xworkz.stylish.boot;
import com.xworkz.stylish.boot.*;
public class CoffeesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Declaring the Coffee Properties and its ingradients");
		System.out.println("=====================================================");
		System.out.println("Coffe Start aytu");
		System.out.println("=====================================================");
		Coffees hegidey = new Coffees();
		System.out.println(hegidey.area);
		System.out.println(hegidey.brand);
		System.out.println(hegidey.CafeName);
		System.out.println(hegidey.cellNum);
		System.out.println(hegidey.content);
		System.out.println(hegidey.cookTime);
		System.out.println(hegidey.country);
		System.out.println(hegidey.distane);
		System.out.println(hegidey.fat);
		System.out.println(hegidey.good);
		System.out.println(hegidey.landmark);
		System.out.println(hegidey.name);
		System.out.println(hegidey.price);
		System.out.println(hegidey.quantity);
		System.out.println(hegidey.sugar);
		System.out.println(hegidey.type);
		System.out.println("=====================================================");
		hegidey.area="RajajiNagar";
		hegidey.brand="Bru";
		hegidey.CafeName="CappuCoffee";
		hegidey.content="HotMilk";
		hegidey.country="MyIndia";
		hegidey.landmark="RajkumarRoad";
		hegidey.name="ColdCoffe";
		hegidey.sugar="With Sugar";
		hegidey.type="Hot Coffee";
		hegidey.cellNum= 9945682265l;
		hegidey.quantity= 100f;
		hegidey.fat= 5.0;
		hegidey.good=false;
		hegidey.price=25;
		hegidey.cookTime=10;
		hegidey.distane=450;
		System.out.println("=====================================================");
		System.out.println("The area of the ColdCoffe :-"+hegidey.area);
		System.out.println("The brand of the ColdCoffe :-"+hegidey.brand);
		System.out.println("The cafe name of the ColdCoffe:-"+hegidey.CafeName);
		System.out.println("you can order calling this num :-"+hegidey.cellNum);
		System.out.println("the ColdCoffe contains :-"+hegidey.content);
		System.out.println("Required time to cook :-"+hegidey.cookTime);
		System.out.println("The ColdCoffe located in :-"+hegidey.country);
		System.out.println("the Distance from Hyderbad :-"+hegidey.distane);
		System.out.println("fat content in the ColdCoffe :-"+hegidey.fat);
		System.out.println("The taste of the ColdCoffe :-"+hegidey.good);
		System.out.println("The landMark of the ColdCoffe in RajajiNagar :-"+hegidey.landmark);
		System.out.println("The name of the ColdCoffe :-"+hegidey.name);
		System.out.println("The Price of the ColdCoffe :-"+hegidey.price);
		System.out.println("The quantity of the ColdCoffe :-"+hegidey.quantity);
		System.out.println("The ColdCoffe is Sugar is SugarLess :-"+hegidey.sugar);
		System.out.println("The Type of the ColdCoffe:-"+hegidey.type);
		System.out.println("=====================================================");
	
	}

}
