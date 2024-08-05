package com.aurionpro.assignment.session2;

public class ProofOfConceptLogicalOperators {
	public static void main(String[] args) {
		int age = 50;
		Boolean handicap = true;
		if ((age > 21 && age < 55))
			System.out.println("You can participate in the race.");
		else
			System.out.println("Cannot Participate");

		if (age > 50 || handicap)
			System.out.println("more chance to get a concession ticket");
		else
			System.out.println("No concession");

		System.out.println(handicap);
		System.out.println(!handicap);
	}
}
