package com.xworkz.technical.programs;

public class OneTwoThreeRnC {

	public static void main(String[] args) {
		// Words and num;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(i);
				// System.out.print("Hello World");
			}
			System.out.println("Arun");
		}
		/*==========================================================*/
		System.out.println("===============================");
		// another way for words and num
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (j == 3) {
					System.out.print("d");
				} else {
					System.out.print(i);
				}
			}
			System.out.println("");
		}
		/*==========================================================*/
		System.out.println("===============================");
		// num & words & num
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == 2) {
					System.out.print("Arun ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println("");
		}
		/*==========================================================*/
		System.out.println("===============================");
		// Pyramid
		/*
		 * # 
		 * ## 
		 * ### 
		 * ####
		 */
		for (int i=0; i<=3; ++i) {
			for (int j=0; j<=i; ++j) {
				System.out.print(" " + "#");
			}
			System.out.println("");
		}
		/*==========================================================*/
		System.out.println("===============================");
		/*
		 * 0
		 * 11
		 * 222
		 * 3333*/
		for (int i=0; i<=3; ++i) {
			for (int j=0; j<=i; ++j) {
				System.out.print(" "+""+i);
			}
			System.out.println("");
		}
		/*==========================================================*/
		System.out.println("===============================");
		
		for (int i=0; i<=3; i++) {
			for (int j=i; j<=3; j++) {
				System.out.print(j);
			}
		System.out.println("");
		}
	}
}
