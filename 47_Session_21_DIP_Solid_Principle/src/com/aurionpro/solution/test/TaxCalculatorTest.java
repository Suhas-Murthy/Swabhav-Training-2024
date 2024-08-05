package com.aurionpro.solution.test;

import com.aurionpro.solution.model.DbLogger;
import com.aurionpro.solution.model.FileLogger;
import com.aurionpro.solution.model.TaxCalculator;

public class TaxCalculatorTest {
public static void main(String[] args) {
	
	TaxCalculator t1 = new TaxCalculator(new DbLogger(), new FileLogger());
	t1.calculateTax(10000, 10);
	
	TaxCalculator t2 = new TaxCalculator(new DbLogger(), new FileLogger());
	t2.calculateTax(1000, 0);
	
}
}
