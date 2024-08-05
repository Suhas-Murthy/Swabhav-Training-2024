package com.aurionpro.iterativestructure;

import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int rem;
	int reverse = 0;
	
	while (number > 0) {
		rem = number % 10;
		reverse = (reverse*10)+rem;
		number = number /10;
	}
	System.out.println(reverse);
}
}
