package com.aurionpro.behavioural.observer.model;

public class SMSNotifer implements INotifier {

	@Override
	public void notify(Account account, String method, int amount) {
		if (method.equals("failed")) {
			InsufficientBalanceException exception = new InsufficientBalanceException(account.getBalance());
			System.out.println("SMS Notification: "+exception.getMessage());
		}
		if (method.equals("credited") || method.equals("debited")) {
			System.out.println("SMS Notification: " + method + " amount of " + amount);
			System.out.println("Your Balance : " + account.getBalance());
			System.out.println();
		}
	}

}
