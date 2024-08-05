package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.InsufficientBalanceException;
import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Bank Service Portal");

		Account account = new Account(1111, "Suhas", 2000);
		account.Menu();
System.out.println("Enter choice: ");
		int choice = scanner.nextInt();
		while (choice != 4) {
			switch (choice) {
			case 1: {
				System.out.println(account.getBalance());
				break;
			}
			case 2: {
				System.out.println("Enter the amount to deposit: ");
				account.deposit(scanner.nextInt());
				break;
			}
			case 3: {
				System.out.println("Enter the amount to withdraw: ");
				try {
				account.withdraw(scanner.nextInt());
				}catch(InsufficientBalanceException exception) {
					System.out.println(exception.getMessage());
				}
				break;
			}
			case 4: {
				break;
			}
			}
			account.Menu();
			// savingAccounts1.savingChoice = 0;
			choice = scanner.nextInt();
		}
		System.out.println("Thank you for using the ATM. Visit Again!!! ");

	}
}
