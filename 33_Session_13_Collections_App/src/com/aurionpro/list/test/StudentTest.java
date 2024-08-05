package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.aurionpro.list.model.Student;

public class StudentTest {
public static void main(String[] args) {
	List<Student> students = new ArrayList<Student>();
	
	students.add(new Student(1,"Suhas",90));
	students.add(new Student(2,"Suresh",80));
	students.add(new Student(3,"Mahesh",75));
	
	System.out.println("Using normal for Loop");
	for(int i = 0;i<students.size();i++) {
		System.out.println(students.get(i));
	}
	System.out.println("Using advance for Loop ---- Most prefereable");
	for(Student student:students) {
		System.out.println(student);;
	}
	
	System.out.println("using iterator");
	Iterator<Student> studentIterator = students.iterator();
	while(studentIterator.hasNext()) {
		System.out.println(studentIterator.next());
	}
	
	System.out.println("using List Iterator");
	ListIterator<Student> studentListIterator = students.listIterator();
		while(studentListIterator.hasNext()) {
			System.out.println(studentListIterator.next());
		}
		System.out.println("using List Iterator - Previous Order");
		while(studentListIterator.hasPrevious()) {
			System.out.println(studentListIterator.previous());
		}
	}
}

