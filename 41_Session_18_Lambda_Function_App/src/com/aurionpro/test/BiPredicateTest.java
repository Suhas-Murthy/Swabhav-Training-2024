package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (Integer number1, Integer number2) -> (number1 > number2);

		int number1 = 2;
		int number2 = 3;
		System.out.println(biPredicate.test(2, 3));
		if (biPredicate.test(2, 3) == true) {
			System.out.println(number1);
			return;
		}
		System.out.println(number2);
	}

}
