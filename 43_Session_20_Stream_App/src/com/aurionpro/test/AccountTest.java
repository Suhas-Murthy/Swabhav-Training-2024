package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(123, "Suhas", 10000));
		accounts.add(new Account(1234, "Maheshwari", 10000));
		accounts.add(new Account(124, "Mohan", 2000));
		accounts.add(new Account(125, "Neel", 12000));
		accounts.add(new Account(126, "Jay", 500));
//		double minBalance = 2000;
		// extra
		// System.out.println("Account with has less than or equal to min balanace");
		// accounts.stream().filter(account->(account.getBalance()-minBalance <=
		// 0)).forEach((account)->System.out.println(account));;

		// 1
		Optional<Account> min = accounts.stream()
				.min((account1, account2) -> (int) (account1.getBalance() - account2.getBalance()));
		if (min.isPresent())
			System.out.println("Min is: " + min.get());
		// 2
		Optional<Account> max = accounts.stream()
				.max((account1, account2) -> (int) (account1.getBalance() - account2.getBalance()));
		if (max.isPresent())
			System.out.println("Max is: " + max.get());

		// 3
		accounts.stream().filter(account -> (account.getName().length() > 6))
				.forEach((account) -> System.out.println(account));
		// map(account->account.substring(,
		// 6)).forEach((student)->System.out.println(student));;

		// 4
		double sumOfBalance = accounts.stream()
				.map(account -> account.getBalance())
				.reduce(0.0,(balance1, balance2) -> balance1 + balance2);
		System.out.println("Total Balance of all Accounts : "+sumOfBalance);
	}

}
