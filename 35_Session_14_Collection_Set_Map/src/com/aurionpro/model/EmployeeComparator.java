package com.aurionpro.model;

import java.util.Comparator;

public class EmployeeComparator {

	public static class EmployeeIdComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getEmployeeId() > employee2.getEmployeeId())
				return 1;
			if (employee1.getEmployeeId() < employee2.getEmployeeId())
				return -1;
			return 0;
		}

	}
	public static class EmployeeNameComparator implements Comparator<Employee> {
		public int compare(Employee employee1, Employee employee2) {
			
			return employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
		}
		
	}
	public static class SalaryComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getSalary() > employee2.getSalary())
				return 1;
			if (employee1.getSalary() < employee2.getSalary())
				return -1;
			return 0;
		}
		
	}
}
