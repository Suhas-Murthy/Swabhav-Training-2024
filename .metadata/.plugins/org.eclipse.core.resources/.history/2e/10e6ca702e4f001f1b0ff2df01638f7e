package com.aurionpro.creational.factory.model;

public class AccountFactory {
	IAccount account = null;

	public IAccount getSavingAccount(AccountType accountType, int accountNumber, String name, int minBalance) {
		if (accountType.equals(AccountType.SAVING)) {
			account = new SavingAccount(accountNumber, name, minBalance);

		}
		return account;
	}

	public IAccount getCurrentAccount(AccountType accountType, int accountNumber, String name, int overDraft) {

		if (accountType.equals(AccountType.CURRENT)) {
			account = new CurrentAccount(accountNumber, name, overDraft);
		}
		return account;
	}
}
