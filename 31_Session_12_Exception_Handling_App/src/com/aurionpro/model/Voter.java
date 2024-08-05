package com.aurionpro.model;

import com.aurionpro.exception.AgeNotValidException;

public class Voter {
	private int voterId;
	private String firstName;
	private String lastName;
	private int age;

	public Voter(int voterId, String firstName, String lastName, int age) {
		super();
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;

		if (age < 18)
			throw new AgeNotValidException();
		this.age = age;

	}

	public int getVoderId() {
		return voterId;
	}

	public void setVoderId(int voderId) {
		this.voterId = voderId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 18) {
				throw new AgeNotValidException();
			}
			this.age = age;
		} catch (AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}

}
