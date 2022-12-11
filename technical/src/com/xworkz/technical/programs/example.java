package com.xworkz.technical.programs;

import java.util.*;

class example {
	public static void main(String[] args) 
	{ int n =0; Scanner sc=new Scanner(System.in); 
	System.out.println("Enter value of n- "); 
	n= sc.nextInt(); 
	int arr[] = new int[n];
	int total =0; System.out.println("Enter value of array elements- "); 
	for(int i= 0 ;i<n;i++)
	{ arr[i]= sc.nextInt(); }
	for(int i =0 ; i<n;i++)
	{ 
		total = total+ arr[i];
		} 
	System.out.println("total sum- "+total);
	 } 
}