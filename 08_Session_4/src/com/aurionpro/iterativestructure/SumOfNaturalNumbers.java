package com.aurionpro.iterativestructure;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int i = 1;
		int ans = 0;
		while (i <= number) {
			ans = ans + i;
			i++;
		}
		System.out.println("Sum of " +number+" natural numbers is "+ans);
	}
}
