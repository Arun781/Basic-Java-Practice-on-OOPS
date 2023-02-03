package com.xworkz.technical.Arrays;

public class PrintOnlyEvenNum {

	public static void describe() {
		System.out.println("I am a production assistant.");
	}

	public static void main(String[] args) {
		System.out.println("Printing only even num in an array....");
		int[] a1 = { 12, 41, 65, 51, 75, 85, 22, 44, 12, 10 };
		for (int i = 0; i <= 9; i++) {
			if (a1[i] % 2 == 0) {
				System.out.println(i + "--->" + a1[i]);
			}
		}

	}

}
