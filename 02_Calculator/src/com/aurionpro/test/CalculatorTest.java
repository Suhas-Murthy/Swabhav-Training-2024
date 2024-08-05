package com.aurionpro.test;
import com.aurionpro.model.*;

public class CalculatorTest {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
	System.out.println("Calculator Calculations");
	System.out.println("Addition : "+ CalculatorModel.addition(a, b));
	System.out.println("Subtraction : "+ CalculatorModel.subtraction(a, b));
	System.out.println("Multiplication : "+ CalculatorModel.multiplication(a, b));
	System.out.println("Division : "+ CalculatorModel.division(a, b));
	}
	
	
}
