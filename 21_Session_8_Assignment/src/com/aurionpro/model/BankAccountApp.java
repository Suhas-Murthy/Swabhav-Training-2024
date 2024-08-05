package com.aurionpro.model;

public class BankAccountApp {
	private long accountNumber;
	private String name;
	private double balance;
	private String accountType;

	public BankAccountApp() {

	}

	public BankAccountApp(long accountNumber, String name, int balance, String accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void credit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit Successful. Amount as been credited to you Account.");
			System.out.println("Your Balance after Deposit: " + balance);
		} else {
			System.out.println("Give Valid Input");
			System.out.println("Transaction Aborted. Try Again...");
		}
	}

	public void debitAmount(int amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successful. Remaining Balance : " + balance);
		} else {
			System.out.println("Withdraw Failed. Insufficient Balance.");
			System.out.print("Your Balance is " + balance);
		}
	}

	
	public void Menu() {
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");

		System.out.println("Please choose an option: ");
	}

}
