package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliInterest;
import com.aurionpro.ocp.solution.model.FixedDeposit;
import com.aurionpro.ocp.solution.model.HoliInterest;
import com.aurionpro.ocp.solution.model.NewYearInterest;
import com.aurionpro.ocp.solution.model.OthersInterest;


public class FDTest {

	public static void main(String[] args) {
		FixedDeposit FD1 = new FixedDeposit(123, "Suhas", 22000.0, 5, new OthersInterest());
		
		System.out.println("Simple interest after "+FD1.getDuration()+" years : "+FD1.simpleInterest());

	}

}
