package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.NameComparator;
import com.aurionpro.model.PercentageComparator;
import com.aurionpro.model.RollNumberComparator;
import com.aurionpro.model.Student;
import com.aurionpro.model.StudentComparator;

public class StudentListTest {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "Suhas", 90));
		students.add(new Student(4, "Suresh", 80));
		students.add(new Student(2, "Rohan", 50));
		students.add(new Student(3, "Mahesh", 75));
		
		
		
		for (Student student : students) {
			System.out.println(student);
		}
		
//		Collections.sort(students, new RollNumberComparator());
		Collections.sort(students, new StudentComparator.RollNumberComparator());
		
		System.out.println("After Sorting based on Roll Number");
		for (Student student : students) {
			System.out.println(student);
		}
		
//		Collections.sort(students, new PercentageComparator());
		Collections.sort(students, new StudentComparator.PercentageComparator());
		System.out.println("After Sorting based on Percentage");
		for (Student student : students) {
			System.out.println(student);
		}
		
		
//		Collections.sort(students, new NameComparator());
		Collections.sort(students, new StudentComparator.NameComparator());
		System.out.println("After Sorting based on Name");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
