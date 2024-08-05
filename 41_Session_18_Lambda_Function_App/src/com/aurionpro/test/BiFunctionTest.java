package com.aurionpro.test;

import java.util.function.BiFunction;

public class BiFunctionTest {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> adder = (Integer number1, Integer number2) -> number1+number2;

//	System.out.println(adder.apply(40, 50));
	method(adder);
	
}
private static void method(BiFunction<Integer, Integer, Integer> adder) {
	
	System.out.println(adder.apply(40, 50));
}
}
