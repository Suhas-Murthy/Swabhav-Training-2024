package com.aurionpro.commandlineargs;

public class SimpleInterestCalculator {
	public static void main(String[] args) {

		int principleAmt = Integer.parseInt(args[0]);
		float rateOfInterest = Integer.parseInt(args[1]);
		int noOfYears = Integer.parseInt(args[2]);
		double simpleInterest = (principleAmt*rateOfInterest*noOfYears)/100;
		System.out.println("Simple Interest : "+ simpleInterest);
	}

}
