package com.aurionpro.iterativestructure;

public class ArmstromNumber {
public static void main(String[] args) {
	int number = 54748;
	int sum = 0;
	int rem;
	int temp = number;
	int pow = 0;
	while(number>0) {
		pow++;
		number = number/10;
	}
	number = temp;
	while(number > 0) {
		rem = number %10;
		sum = sum + (int)(Math.pow(rem, pow));
		number = number/10;
	}
	if (sum == temp) {
		System.out.println("ArmStrong Number");
	}
	else {
		System.out.println("Not a Armstrong number");
	}
}
}
