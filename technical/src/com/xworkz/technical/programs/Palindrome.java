package com.xworkz.technical.programs;
import java.util.Scanner;

public class Palindrome {
	 
	class palindrome {
	    public void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a string as an input to check whether it is palindrome or not");
	        String input= scanner.nextLine();
	        //checking whether palindrome or not
	        if(isPalindrome(input))
	        {
	            System.out.println(input+" is a palindrome string");
	        }
	        else
	        {
	            System.out.println(input+" is not a palindrome string");
	        }
	    }
	 
	    public boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        
	        while(left < right)
	        {
	            if(str.charAt(left) != str.charAt(right))
	            {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    } 
	}

}
