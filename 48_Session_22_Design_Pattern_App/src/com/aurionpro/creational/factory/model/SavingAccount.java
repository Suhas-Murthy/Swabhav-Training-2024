package com.aurionpro.creational.factory.model;

public class SavingAccount implements IAccount {
	private int accountNumber;
	private String name;
	private int balance =3000;
	private int minBalance;
	private AccountType accountType = AccountType.SAVING;
	

	public SavingAccount(int accountNumber, String name, int minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.minBalance = minBalance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int getMinBalance() {
		return minBalance;
	}



	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}


	@Override
	public void credit(int deposit) {
		this.balance += deposit;
		System.out.println("Deposit Successful. New Balance : " + this.balance);
	}

	@Override
	public void debit(int withdraw) {
		
		if(withdraw>balance)
			System.out.println("Insufficient balaance");
		else {this.balance -= withdraw;
		System.out.println("Withdraw Successful");
		}

	}

}
