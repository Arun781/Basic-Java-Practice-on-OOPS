package com.xworkz.technical.test;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Rajajinagar", arun="";
        char AA;
      System.out.print("Original word: ");
      System.out.println("Rajajinagar"); 
        
      for (int i=0; i<str.length(); i++)
      {
    	  AA= str.charAt(i); 
        arun= AA+arun;
      }
      System.out.println("______________");
      System.out.println("Reversed word: "+ arun);
    }

	}


