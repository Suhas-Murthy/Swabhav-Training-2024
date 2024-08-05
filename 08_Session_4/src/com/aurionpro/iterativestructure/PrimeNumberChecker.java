package com.aurionpro.iterativestructure;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i = 2;
		int count = 0;
		
		while (i < number) {
			if (number % i == 0) {
				count++;
			} 
			i++;
		}
		if (count==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
