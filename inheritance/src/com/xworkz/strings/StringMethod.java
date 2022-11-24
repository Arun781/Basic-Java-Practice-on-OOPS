package com.xworkz.strings;

public class StringMethod {
	public static void main(String[] args) {

		String source1 = "Arun";
		System.out.println(source1);
		System.out.println("_________________________________");
		source1 = source1 + " Veerapur";

		String source2 = source1.concat(",Hi");
		System.out.println(source2);
		System.out.println("_________________________________");

		char source3 = source1.charAt(3);
		System.out.println(source3);
		System.out.println("Returns the char value at the specified index.");
		System.out.println("_________________________________");

		int source4 = source1.codePointAt(2);
		System.out.println(source4);
		System.out.println("Returns the character (Unicode code point) at the specified index.");
		System.out.println("_________________________________");

		int source5 = source1.codePointBefore(1);
		System.out.println(source5);
		System.out.println("Returns the character (Unicode code point) before the specified index.");
		System.out.println("_________________________________");

		int source6 = source1.codePointCount(1, 3);
		System.out.println(source6);
		System.out.println("Returns the number of Unicode code points in the specified text range of this String.");
		System.out.println("_________________________________");

		int source7 = source2.compareTo(source1);
		System.out.println(source7);
		System.out.println("Compares two strings lexicographically.");
		System.out.println("_________________________________");

		boolean source8 = source1.contains("SE");
		System.out.println(source8);
		System.out.println("Returns true if and only if this string contains the specified sequence of char values.");
		System.out.println("_________________________________");

		boolean source9 = source1.contentEquals("HELLO WORLD");
		System.out.println(source9);
		System.out.println("Compares this string to the specified CharSequence.");
		System.out.println("_________________________________");

		boolean source10 = source1.endsWith("D");
		System.out.println(source10);
		System.out.println("_________________________________");

		int source11 = source1.hashCode();
		System.out.println(source11);
		System.out.println("Returns a hash code for this string.");
		System.out.println("_________________________________");

		int source12 = source1.indexOf(2);
		System.out.println(source12);
		System.out.println("Returns the index within this string of the first occurrence of the specified character.");
		System.out.println("_________________________________");

		String source13 = source1.intern();
		System.out.println(source13);
		System.out.println("Returns a canonical representation for the string object");
		System.out.println("_________________________________");

		boolean source14 = source1.isEmpty();
		System.out.println(source14);
		System.out.println("Returns true if, and only if, length() is 0.");
		System.out.println("_________________________________");

		int source15 = source1.lastIndexOf(2);
		System.out.println(source15);
		System.out.println("Returns the index within this string of the last occurrence of the specified character.");
		System.out.println("_________________________________");

		boolean source16 = source1.matches("HELLO WORLD");
		System.out.println(source16);
		System.out.println("Tells whether or not this string matches the given regular expression.");
		System.out.println("_________________________________");

		String source17 = source1.replace('H', 'R');
		System.out.println(source17);
		System.out.println("Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.");
		System.out.println("_________________________________");

		int source18 = source1.length();
		System.out.println(source18);
		System.out.println("Returns the length of this string.");
		System.out.println("_________________________________");

		String source19 = source1.replace("KILLER", "DEVIL");
		System.out.println(source19);
		System.out.println("Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.");
		System.out.println("_________________________________");

		String source20 = source1.replaceAll("DEVIL", "KILLER");
		System.out.println(source20);
		System.out.println("Replaces each substring of this string that matches the given regular expression with the given replacement");
		System.out.println("_________________________________");

		boolean source21 = source1.startsWith("KILLER");
		System.out.println(source21);
		System.out.println("Tests if this string starts with the specified prefix.");
		System.out.println("_________________________________");

		boolean source22 = source1.startsWith("KILLER", 2);
		System.out.println(source22);
		System.out.println("Tests if the substring of this string beginning at the specified index starts with the specified prefix.");
		System.out.println("_________________________________");

		char[] source23 = source1.toCharArray();
		System.out.println(source23);
		System.out.println("Converts this string to a new character array.");
		System.out.println("_________________________________");

		String source24 = source1.toLowerCase();
		System.out.println(source24);
		System.out.println("Converts all of the characters in this String to lower case using the rules of the given Locale.");
		System.out.println("_________________________________");

		String source25 = source24.toUpperCase();
		System.out.println(source25);
		System.out.println("Converts all of the characters in this String to upper case using the rules of the default locale.");
		System.out.println("_________________________________");
	}
}