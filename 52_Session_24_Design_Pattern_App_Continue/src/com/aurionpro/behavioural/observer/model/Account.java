package com.aurionpro.behavioural.observer.model;

import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	private List<INotifier> notifiers;
	

	public Account(int accountNumber, String name, int balance, List<INotifier> notifiers) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = notifiers;
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
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public void withdraw(int withdraw) {
		if (withdraw > this.balance) {
			notifiers.forEach((notifier)->notifier.notify(this,"failed",withdraw));
			throw new InsufficientBalanceException(balance);
		}
		if (withdraw > 0 && withdraw <= this.balance) {
			this.balance -= withdraw;
			System.out.println("Withdraw Successful. Remaining Balance : " + this.balance);
			notifiers.forEach((notifier)->notifier.notify(this,"debited",withdraw));
		}
	}
	
	public void deposit(int deposit) {
		this.balance += deposit;
		System.out.println("Deposit Successful. New Balance : " + balance);
//		Account.this.notifers.notify();
		notifiers.forEach((notifier)->notifier.notify(this,"credited",deposit));
	}
	
//	public void registerNotifier(INotifier notifier) {
//		notifers.add(notifier);
//	}
}
