package com.aurionpro.iterativestructure;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	int sum = 0;
	int rem;
	
	while(number > 0) {
		rem = number % 10;
		sum = sum + rem;
		number = number / 10;
	}
	System.out.println(sum);
	
}
}
