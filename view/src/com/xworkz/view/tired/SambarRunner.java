package com.xworkz.view.tired;
public class SambarRunner {

	public static void main(String[] args) {
			String[] items= {"salt","water","sunflower oil","onion","sambar powder","turmeric"};
			String[] temp= {"yellow","red"};
			String value="bele sambar";
			Sambar sambar=new Sambar(value,true,temp,4,items);
			System.out.println(sambar.name);
			sambar.display();
		
			System.out.println(sambar.veg);
			System.out.println(sambar.color);
			System.out.println(sambar.quantity);
			System.out.println(sambar.ingredients);
			System.out.println(sambar);
			
			System.out.println(System.lineSeparator());
			Sambar sambar2=new Sambar("rasam",true,temp,5,items);
			System.out.println(sambar2.name);
			
			System.out.println(sambar2.veg);
			System.out.println(sambar2.color);
			System.out.println(sambar2.quantity);
			System.out.println(sambar2.ingredients);
			System.out.println(sambar2);
			sambar2.display();
			
			System.out.println(System.lineSeparator());
			Sambar sambar3=new Sambar("basaru",true,items,5,temp);
			System.out.println(sambar3.name);
			
			System.out.println(sambar3.veg);
			System.out.println(sambar3.color);
			System.out.println(sambar3.quantity);
			System.out.println(sambar3.ingredients);
			System.out.println(sambar3);
			sambar3.display();
			
			System.out.println(System.lineSeparator());
			Sambar sambar4=new Sambar("chicken sambar",true,items,5,temp);
			System.out.println(sambar4.name);
			System.out.println(sambar4.veg);
			System.out.println(sambar4.color);
			System.out.println(sambar4.quantity);
			System.out.println(sambar4.ingredients);
			System.out.println(sambar4);
			sambar4.display();
			
		}

	}