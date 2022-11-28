package com.xworkz.technical.tech;

public class ReverseAGivenString {

	public static void main(String[] args) {
		String A = "Arun Veerapur";
		//with using the for loop reverse String
		for(int a=A.length()-1;a>=0;a--) {
		System.out.println("Reverse Name:-"+A.charAt(a));
		}
		System.out.println("___________________________________________");
		//without using the for loop reverse String
		String reverse = new StringBuffer(A).reverse().toString();
		System.out.println(reverse);
		System.out.println("___________________________________________");	
	}
}

