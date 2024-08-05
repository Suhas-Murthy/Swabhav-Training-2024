package com.aurionpro.test;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter an number : ");
	
	int number = sc.nextInt();
	
	if(number % 2 == 0) {
		System.out.println("Even");
		return;
	}
	System.out.println("ODD");
	}

}
