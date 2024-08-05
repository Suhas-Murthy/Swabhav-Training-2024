package com.aurionpro.test;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number 1: ");
	int number1 = sc.nextInt();
	System.out.print("Enter number 2: ");
	int number2 = sc.nextInt();
	
	System.out.println("Sum of "+number1 +" & "+ number2 + ": "+ (number1+number2));
	sc.close();
	}
}
