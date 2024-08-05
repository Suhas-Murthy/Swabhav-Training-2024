package com.aurionpro.exception;

public class AgeNotValidException extends RuntimeException {

	public String getMessage() {
		return "Age Not Valid: Age must be less than 18";
	}

}
