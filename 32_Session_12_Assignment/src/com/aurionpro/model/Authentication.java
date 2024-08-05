package com.aurionpro.model;

import com.aurionpro.exception.EmailNotValidException;
import com.aurionpro.exception.PasswordNotValidException;

public class Authentication {
	private String email;
	private String password;

	public Authentication(String email, String password) {
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		if (!email.contains("@") || !email.contains(".")) {
			throw new EmailNotValidException();
		}
		this.email = email;
		System.out.println("Email Validated");
	}

	public void setPassword(String password) {
		if (password.length() < 8 || !passwordValidate(password)) {
			throw new PasswordNotValidException();
		}
		this.password = password;
		System.out.println("Password Validated");
	}

	@Override
	public String toString() {
		return "Authentication [Email=" + email + ", password=" + password + "]";
	}

	private boolean passwordValidate(String password) {
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		boolean hasSpecialCharacter = false;

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c)) {
				hasUpperCase = true;
			}
			if (Character.isLowerCase(c)) {
				hasLowerCase = true;
			}
			if (Character.isDigit(c)) {
				hasDigit = true;
			}
			if (!Character.isLetterOrDigit(c)) {
				hasSpecialCharacter = true;
			}
		}
		return hasDigit && hasLowerCase && hasSpecialCharacter && hasUpperCase;

	}
}

// private String email;
// private String password;
//
// public Authentication(String email, String password) {
// if (!email.contains("@") || !email.contains("."))
// throw new EmailNotValidException();
// this.email = email;
// System.out.println("Email Validated");
//
// if (password.length() < 8 && passwordValidate() == false) {
// throw new PasswordNotValidException();
// }
// System.out.println(password.length());
// System.out.println(passwordValidate());
// this.password = password;
// System.out.println("Password Validated");
// }
//
// public String getEmail() {
// return email;
// }
//
// public String getPassword() {
// return password;
// }
//
// public void setEmail(String email) {
// if (!email.contains("@") && !email.contains(".")) {
// throw new EmailNotValidException();
// }
// this.email = email;
// }
//
// public void setPassword(String password) {
// try {
// if (password.length() < 8 && passwordValidate() == false) {
// throw new PasswordNotValidException();
// }
// this.password = password;
// } catch (PasswordNotValidException e) {
// System.out.println(e.getPasswordNotValidException());
// }
// }
//
// @Override
// public String toString() {
// return "Authentication [Email=" + email + ", password=" + password + "]";
// }
//
// public void emailValidate() {
// if (!email.contains("@") && !email.contains(".")) {
// throw new EmailNotValidException();
// }
//
// }
//
// public boolean passwordValidate() {
// System.out.println("Outside for");
// boolean hasUpperCase = false;
// boolean hasLowerCase = false;
// boolean hasDigit = false;
// boolean hasSpecialCharacter = false;
//
// for (int i = 0; i < password.length(); i++) {
// System.out.println("Inside for");
// char c = password.charAt(i);
// if (Character.isUpperCase(c)) {
// hasUpperCase = true;
// }
// if (Character.isLowerCase(c)) {
// hasLowerCase = true;
// }
// if (Character.isDigit(c)) {
// hasDigit = true;
// }
// if (!Character.isLetterOrDigit(c)) {
// hasSpecialCharacter = true;
// }
// System.out.println(hasDigit + " " + hasLowerCase + " " + hasSpecialCharacter
// + " " + hasUpperCase);
//
// }
// return hasDigit && hasLowerCase && hasSpecialCharacter && hasUpperCase;
// }

// }
