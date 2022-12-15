package com.xworkz.technical.programs;

public class f1 {

	public static void main(String[] args) {
		int c1=0;
		int c2=1;
		int count=10;
		for(int i=0;i<=count;++i) {
			int c=c1+c2;
			c1=c2;
			c2=c;
			System.out.print("_"+c);
		}
		
	}
}
