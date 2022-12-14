package com.xworkz.technical.programs;

import java.util.Scanner;

/*Write a program  to check the coupon code
1) coupon code must be 9 character
2) first two characters must be uppercase 
3) 4 digit must be a number and it represents the year (2022)
4) remaining three digits represents the coupon series in that last character must be a  uppercase.
Example:
Input: CT202001S
Output: Valid coupon*/

public class CheckTheCouponCode {
	public static void main(String[] arvgf) {
		/*String a = "CT202001S";
		System.out.println("Valid " + a);*/
		Scanner scan = new Scanner(System.in);
		String coupon = scan.next();
		String str1 = coupon.substring(0,2);
		System.out.println(str1);
		String str2 = coupon.substring(2,6);
		System.out.println(str2);
		String str3 = coupon.substring(6,9);
		System.out.println(str3);
		/*AS070307S3S
		AS
		0703
		07S*/
		int convertString = Integer.parseInt(str2);
		//int convertString1 = Integer.valueOf(str3);
		System.out.println("Converting String to int:-"+convertString);
		if(coupon.length()==9 && convertString==2022) {
			
		}
		
		
		
		
		if(coupon.length()==9 && convertString==2022) {
			System.out.println("Coupon is Valid:-"+coupon);
		}else {
			System.out.println("Coupon is not valid.."+coupon);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
