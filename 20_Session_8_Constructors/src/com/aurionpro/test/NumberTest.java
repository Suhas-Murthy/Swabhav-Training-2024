package com.aurionpro.test;
import com.aurionpro.model.Number;


public class NumberTest {
public static void main(String[] args) {
	Number number1 = new Number(10);
	Number number2 = new Number(20);
	
	
	System.out.println("Before Swapping : ");
	System.out.println("Number 1 : " + number1.getValue()+" \t Number 2 : "+number2.getValue());
	
	swap(number1,number2);
	System.out.println("After Swapping : ");
	System.out.println("Number 1 : " + number1.getValue()+" \t Number 2 : "+number2.getValue());
}

private static void swap(Number number1, Number number2) {
	int temp = number1.getValue();
	number1.setValue(number2.getValue());
	number2.setValue(temp);
	
}
}
