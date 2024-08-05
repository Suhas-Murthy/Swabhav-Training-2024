package com.aurionpro.test;

import java.util.function.Function;

public class FunctionTest {
public static void main(String[] args) {
	Function<Integer, Integer> squareNumber = (Integer number) -> number*number;
//	adder <---variable
//	(Integer number) -> number*number; <==== defination of the method
	System.out.println(squareNumber.apply(5));
}
}
