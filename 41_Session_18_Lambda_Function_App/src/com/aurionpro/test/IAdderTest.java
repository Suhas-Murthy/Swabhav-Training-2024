package com.aurionpro.test;

import com.aurionpro.model.IAddition;

public class IAdderTest {
public static void main(String[] args) {
	IAddition adder  = (number1,number2) -> number1+number2;
	
	System.out.println(adder.add(5,7));
	
}
}
