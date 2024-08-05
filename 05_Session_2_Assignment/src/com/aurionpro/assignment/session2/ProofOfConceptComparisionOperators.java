package com.aurionpro.assignment.session2;

public class ProofOfConceptComparisionOperators {
public static void main(String[] args) {
	int number1 = 10;
	int number2 = 10;
	int number3 = 50;
	int number4 = 100;
	if (number1 == number2)
		System.out.println("They are equal");
	
	if (number1 != number3)
		System.out.println("They are not equal");
	
	if(number1<number3)
		System.out.println(number3 +" is greater than " + number1);
	
//	if(number1<=number3)
//		System.out.println(number3 +" is greater than " + number1);
//	
//	if(number4>=number2)
//		System.out.println(number3 +" is greater than " + number1);
	
	if(number4 > number2)
		System.out.println(number4+ " is greater than "+ number2+ " ,if part");
	else
		System.out.println(number2+ " is greater than "+ number4 + " ,else part");
}
}
