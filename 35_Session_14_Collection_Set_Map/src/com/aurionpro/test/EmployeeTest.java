package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Employee;
import com.aurionpro.model.EmployeeComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, "Suhas", 30000));
		employees.add(new Employee(5, "Suresh", 40000));
		employees.add(new Employee(2, "Gaurav", 10000));
		employees.add(new Employee(4, "Jatin", 15000));
		employees.add(new Employee(3, "Subodh", 30000));

		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		System.out.println();
		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
		Collections.sort(employees, new EmployeeComparator.SalaryComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
