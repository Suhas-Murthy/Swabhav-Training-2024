package com.aurionpro.assignment.session4;

import java.util.Scanner;

public class AtmMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double balance = 1000.00;
		do {
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Please choose an option: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Your current balance is: $" + balance);
				break;
			}
			case 2: {
				System.out.print("Enter amount to deposit: ");
				double deposit = sc.nextDouble();
				balance += deposit;
				System.out.println("You have deposited $" + deposit + ". Your new balance is $" + balance);
				break;
			}
			case 3: {
				System.out.print("Enter amount to withdraw: ");
				double withdraw = sc.nextDouble();
				balance -= withdraw;
				System.out.println("You have withdrawn $" + withdraw + ". Your new balance is $" + balance);
				break;
			}
			case 4: {
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;
			}
			default: {
				System.out.println("Invalid input. Please select correct option");
			}
			}
		} while (choice != 4);

	}
}
