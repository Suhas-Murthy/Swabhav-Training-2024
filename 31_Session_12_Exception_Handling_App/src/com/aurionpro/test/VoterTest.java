package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Voter ID : ");
		int voterId = scanner.nextInt();
		System.out.println("Enter your First Name: ");
		String firstName = scanner.next();
		System.out.println("Enter your Last Name: ");
		String lastName = scanner.next();
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		try {
		Voter voter = new Voter(voterId, firstName, lastName, age);
		System.out.println(voter);
		}catch(AgeNotValidException exception){
			System.out.println(exception.getMessage());
		}
		
	}

}
