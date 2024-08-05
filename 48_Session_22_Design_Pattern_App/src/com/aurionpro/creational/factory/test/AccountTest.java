package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.CarName;
import com.aurionpro.creational.factory.model.IAccount;
import com.aurionpro.creational.factory.model.ICar;

public class AccountTest {

	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		IAccount account = accountFactory.getSavingAccount(AccountType.SAVING, 123, "Suhas", 2000);
		account.credit(100);
		account.debit(4000);
		

	}

}
