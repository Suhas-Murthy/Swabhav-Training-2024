package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	AreaCalculator calculate;

	@BeforeEach
	void before() {
		calculate = new AreaCalculator();
	}
	@Test
	public void testCalculateAreaOfCircle() {
		assertEquals(3.14, calculate.calculateAreaOfCircle(1));

	}
}
