package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount BankAccount1 = new BankAccount();
		BankAccount BankAccount2 = new BankAccount();

		BankAccount1.setName("Suhas");
		BankAccount2.setName("Ram");
		BankAccount1.setAccountNumber(0012345);
		BankAccount2.setAccountNumber(0012457);
		BankAccount1.setBalance(1000);
		BankAccount2.setBalance(3000);
		// BankAccount1.setAccountPin(2468);
		// BankAccount2.setAccountPin(1357);

		System.out.println("Select your Name: ");
		System.out.println("1." + BankAccount1.getName());
		System.out.println("2." + BankAccount2.getName());
		int nameChoice = sc.nextInt();
		if (nameChoice == 1) {
			BankAccount1.Menu();
			int choice = sc.nextInt();
			while (choice != 4) {

				switch (choice) {
				case 1: {
					System.out.println(BankAccount1.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
					BankAccount1.amountDeposit(sc.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					BankAccount1.amountWithdraw(sc.nextInt());
					break;
				}
				case 4: {

					break;
				}
				}
				BankAccount1.Menu();
				choice = sc.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");
		}

		else if (nameChoice == 2) {
			BankAccount2.Menu();
			int choice = sc.nextInt();
			while (choice != 4) {
				switch (choice) {
				case 1: {
					System.out.println(BankAccount2.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
					BankAccount2.amountDeposit(sc.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					BankAccount2.amountWithdraw(sc.nextInt());
					break;
				}
				case 4: {
					break;
				}
				}
				BankAccount2.Menu();
				choice = sc.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");

		} else {
			System.out.println("Enter Valid Choice");
		}
		sc.close();
	}
}
// BankAccount1.amountWithdraw(sc.nextInt());
// BankAccount2.amountWithdraw(sc.nextInt());
//
// BankAccount1.amountDeposit(sc.nextInt());
// BankAccount2.amountDeposit(sc.nextInt());

// System.out.println("Select your Name: ");
// System.out.println("1." + BankAccount1.getName());
// System.out.println("2." + BankAccount2.getName());
// int nameChoice = sc.nextInt();
// if (nameChoice == 1) {
// if(BankAccount1.getAccountPin() == 2468) {
//
// }
// }

// System.out.println("Welcome to Swabhav ATM");
// System.out.println("ATM Menu:");
// System.out.println("1. Check Balance");
// System.out.println("2. Deposit Money");
// System.out.println("3. Withdraw Money");
// System.out.println("4. Exit");
//
// System.out.println("Please choose an option: ");
// int choice = sc.nextInt();
// switch(choice) {
// case 1:{
// System.out.println(BankAccount1.getBalance());
// }
// }
