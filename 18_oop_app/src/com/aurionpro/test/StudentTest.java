package com.aurionpro.test;

import com.aurionpro.model.Student;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();

		System.out.print("Enter Rollnumber : ");
		int rollNumber = sc.nextInt();
		s1.setRollNumber(rollNumber);

		System.out.print("Enter Name : ");
		String name = sc.next();
		s1.setName(name);

		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		s1.setAge(age);

		System.out.print("Enter Percentage : ");
		int percentage = sc.nextInt();
		s1.setPercentage(percentage);

		System.out.println("Name : " + s1.getName() + ", Age: " + s1.getAge() + ",Percentage: " + s1.getPercentage()
				+ ",Roll number: " + s1.getRollNumber());
		s1.studentGrade();
		sc.close();
	}
}
