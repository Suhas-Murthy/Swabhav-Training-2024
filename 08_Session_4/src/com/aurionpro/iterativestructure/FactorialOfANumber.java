package com.aurionpro.iterativestructure;

public class FactorialOfANumber {
public static void main(String[] args) {
	int  number = 6;
	int fact = 1;
	for (int i = 1; i<=number; i++) {
		fact = fact * i;
//		System.out.print(i+ " ");
	}
	
//		System.out.println();
	System.out.println("Facorial Value " + fact);
}
}
