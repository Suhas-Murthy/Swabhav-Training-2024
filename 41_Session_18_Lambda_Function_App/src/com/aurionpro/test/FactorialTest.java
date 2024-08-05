package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {
	public static void main(String[] args) {

		IFactorial fact = (number1) -> {
			int factorial = 1;
			for (int i = 1; i <= number1; i++) {
				factorial = factorial * i;
			}
			// System.out.println(factorial);
			return factorial;
		};
		System.out.println(fact.fact(5));
	}
}
