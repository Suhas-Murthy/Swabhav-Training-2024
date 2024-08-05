package com.aurionpro.iterativestructure;

import java.util.Scanner;

public class PerfectNumberChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = sc.nextInt();
//	int temp = number;
	
	int sum = 0;
	int i =1;
	
	while (i < number) {
		if (number % i == 0) {
			sum = sum + i;
		}
		i++;
	}
	if (sum == number) {
	System.out.println("Perfect Number");
	}else {
		System.out.println("Not a Perfect Number");
	}
}
}
