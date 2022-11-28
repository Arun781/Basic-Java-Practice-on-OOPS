package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.Forest;

public class MagroveForest implements Forest{
	public String animalSound() {
		System.out.println("wawawawawawawa");
		return "hi";
	}
	public String animalName() {
		 System.out.println("Crazy Kid");
		return null;
	 }
	public int animalAge() {
		 System.out.println("23");
		return 0; 
	 }
	public String animalDOB() {
		 System.out.println("1999/03/23");
		return null; 
	 }
	public String sleep() {
		 System.out.println("8");
		return null;
	 }
}
