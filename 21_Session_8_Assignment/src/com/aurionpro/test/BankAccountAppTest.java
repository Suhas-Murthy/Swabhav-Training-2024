package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccountApp;

public class BankAccountAppTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Accounts : ");
		int number = sc.nextInt();
		BankAccountApp bankAccounts[] = new BankAccountApp[number];

		
		
		
		
		
		sc.close();
	}
}

// Dummy
// long accountNumbers[] = new long[number];
// String names[] = { "Suhas", "Ramesh", "Mahesh", "Rohan", "Mohan", "Jateen",
// "Shilpa", "Sakshi", "Mitali",
// "Yadullah" };
// double balances[] = { 33500, 4000, 6000, 7000, 33500, 33100, 3000, 33000,
// 33200, 30000 };
// String accType[] = { "Salary", "Current", "Saving", "Salary", "Current",
// "Saving", "Salary", "Current",
// "Saving", "Salary" };
//
// long value = 10003004;
// for (int i = 0; i < number; i++) {
// accountNumbers[i] = value;
// value++;
// }
//
// for (int i = 0; i < number; i++) {
//
//
// int choice = sc.nextInt();
// while (choice != 4) {
//
// switch (choice) {
// case 1: {
// System.out.println(bankAccounts[i].getBalance());
// break;
// }
// case 2: {
// System.out.println("Enter the amount to deposit: ");
// bankAccounts[i].credit(sc.nextInt());
// break;
// }
// case 3: {
// System.out.println("Enter the amount to withdraw: ");
// bankAccounts[i].debitAmount(sc.nextInt());
// break;
// }
// case 4: {
//
// break;
// }
// }
// bankAccounts[i].Menu();
// choice = sc.nextInt();
// }
// System.out.println("Thank you for using the ATM. Visit Again!!! ");
// }
// double max = 0.0;
// for(int i = 0;i<number;i++) {
// if(balances[i] >= max) {
// max = balances[i];
// }
//
// } System.out.println("Maximum Balance account holder is "+ max);