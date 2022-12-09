package com.xworkz.technical.tech;

public class ProgramToCountAndRemoveTheWhiteSpacesFromTheAGivenString {
	public static void main(String[] args) {

		String str1 = "Hands on learning happen";
		String s = " ";
		int count = 0;
		for (char ch : str1.toCharArray()) {
			if (ch == ' ') {
				count++;
			} else {
				s = s + ch;
				// s += ch;
			}
		}
		System.out.println("White Spaces:-" + count);
		System.out.println("String without white spaces:-" + s);
	}
}
