package com.aurionpro.model;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private int percentage;

	public Student(int rollNo, String sName, int sAge, int percent ) {
		rollNumber = rollNo;
		name = sName;
		age = sAge;
		percentage = percent;
	}
	
	public Student() {
		this.rollNumber = 1;
		this.name = "Name";
		this.age = 21;
		this.percentage = 70;
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getPercentage() {
		return percentage;
	}

	// Setters
	public void setRollNumber(int r) {
		this.rollNumber = r;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void studentGrade() {
		if (this.percentage > 75) {
			System.out.println("Grade A");
		} else if (this.percentage > 60 && this.percentage < 75) {
			System.out.println("Grade B");
		} else if (this.percentage > 50 && this.percentage < 60) {
			System.out.println("Grade C");
		} else if (this.percentage > 40 && this.percentage < 50) {
			System.out.println("Grade D");
		} else if (this.percentage < 40) {
			System.out.println("Grade E");
		}
	}
}
