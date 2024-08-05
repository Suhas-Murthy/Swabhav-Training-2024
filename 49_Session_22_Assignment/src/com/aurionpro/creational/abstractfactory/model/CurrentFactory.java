package com.aurionpro.creational.abstractfactory.model;

public class CurrentFactory implements IAccountFactory{



	@Override
	public IAccount getAccount(int accountNumber, String name, int balance) {
		return new CurrentAccount(accountNumber, name, balance);
	}

}
