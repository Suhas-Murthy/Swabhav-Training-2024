package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.list.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		List<Account> accounts = new ArrayList<Account>();

		System.out.println("Enter number of accounts to be created : ");
		int numberOfAccounts = scanner.nextInt();

		for (int i = 0; i < numberOfAccounts; i++) {
			int accountNumber = random.nextInt(10000) + 10000;
			System.out.println("Your Account Number auto generated : " + accountNumber);
			System.out.println("Enter your name: ");
			String name = scanner.next();
			System.out.println("Enter your balance : ");
			int balance = scanner.nextInt();

			accounts.add(new Account(accountNumber, name, balance));
		}

		System.out.println(accounts);
		Account maxBalanceAccount = accounts.get(0);

		for (Account account : accounts) {
			if (account.getBalance() > maxBalanceAccount.getBalance()) {
				maxBalanceAccount = account;
			}
		}
		System.out.println(maxBalanceAccount);

//		for (int i = 0; i < numberOfAccounts; i++) {
//			for (int j = 1; j < numberOfAccounts; j++) {
//				if (accounts.get(i).getBalance() > accounts.get(j).getBalance()) {
//					Account temp = accounts.get(i);
//					accounts.get(j) = accounts.get(i);
//				}
//			}
//		}
	}
}