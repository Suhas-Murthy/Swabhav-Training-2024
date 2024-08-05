package com.aurionpro.test;

import java.util.function.Supplier;

public class SupplierTest {
public static void main(String[] args) {
	
	Supplier<Integer> randomNumber = () -> (int)(Math.random()*1000);
	System.out.println("Number generated random number is : "+randomNumber.get());
//	randomNumber.get();
}
}
