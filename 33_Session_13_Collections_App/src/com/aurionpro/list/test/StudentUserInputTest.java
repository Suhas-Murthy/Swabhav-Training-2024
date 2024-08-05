package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.aurionpro.list.model.Student;

public class StudentUserInputTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of Students: ");
		int number = scanner.nextInt();

		readStudents(students, scanner, number);
		System.out.println();
		printStudents(students);

	}

	private static void readStudents(List<Student> students, Scanner scanner, int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("Enter Roll number : ");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter Name of Student : ");
			String name = scanner.next();
			System.out.println("Enter Percentage of Student : ");
			double percentage = scanner.nextDouble();

			students.add(new Student(rollNumber, name, percentage));
		}
	}

	private static void printStudents(List<Student> students) {
		System.out.println("Using advance for Loop ---- Most prefereable");
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
