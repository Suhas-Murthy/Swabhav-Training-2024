package com.aurionpro.iterativestructure;

import java.util.Scanner;

public class Pallindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = sc.nextInt();
	int rem = 0;
	int rev = 0;
	int temp = number;
	
	while(number>0) {
		rem = number %10;
		rev = (rev*10)+rem;
		number = number / 10;
		
	}
	if(temp == rev) {
		System.out.println(temp + " is a Pallindrome");
	}
	else {
		System.out.println(temp + " is not a Pallindrome");
	}
}
}
