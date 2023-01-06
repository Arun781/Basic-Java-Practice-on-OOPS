package com.xworkz.technical.techFiles;

public class EvenOrOdd {
public static void main(String[] args) {
	int num;
	for(num=1 ; num<=20; num++) {
		if((num%2)==0)
		System.out.println("Even Number:-"+num);
	}
	System.err.println("______________________________");
	for(num=1 ; num<=20; num++) {
		if(num%2!=0)
		
		System.out.println("odd Number:-"+num);
	}
	System.err.println("________________________________");
	System.out.println("Reverse ordder num");
	for(int i=5; i>=1; i++) {
		System.out.println("Reverse order num:-"+i);
	}
}
}
