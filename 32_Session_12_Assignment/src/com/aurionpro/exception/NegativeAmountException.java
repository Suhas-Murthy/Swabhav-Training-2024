package com.aurionpro.exception;

public class NegativeAmountException extends RuntimeException{

	public String getNegativeAmountException() {
		return "You have entered amount value in negative \nNegative value not accepted";
	}

}
