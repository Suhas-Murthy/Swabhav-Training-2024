package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	
	@BeforeEach
	void before() {
		operation = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Finished");
	}
	
	@Test
	public void testAddition() {
		
		assertEquals(30,operation.addition(10, 20),"Addition method : ");
	}
	@Test
	public void testSubtraction() {
		
		assertEquals(0,operation.subtraction(20, 20));
	}
	@Test
	public void testMultiplication() {
		
		assertEquals(200,operation.multiplication(10, 20));
	}
	@Test
	public void testsquareOfArrayElements() {
		int squares[] = {25,36,49};
		int numbers[] = {5,6,7};
		assertArrayEquals(squares,operation.squareOfArrayElements(numbers));
	}
		
	@Test
	public void testIsEven() {
//		assertEquals(true, operation.isEven(6));
		
		assertTrue(operation.isEven(6));
		assertFalse(operation.isEven(7));
	}
	
	@Test
	public void testDivision() {
		assertThrows(ArithmeticException.class,()-> operation.division(20, 0));
		assertEquals(2.0, operation.division(20, 10));
	}

}
