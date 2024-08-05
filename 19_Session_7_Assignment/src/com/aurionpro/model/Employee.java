package com.aurionpro.model;

public class Employee {
	private int employeeId;
	private String name;
	private int salary;
	
	public Employee(int employeeId, String name, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		this.employeeId = 0;
		this.name = name;
		this.salary = 25000;
	}
	
	public int getEmployeeID(){
		return this.employeeId;
	}
	public String getEmployeeName(){
		return this.name;
	}
	public int getEmployeeSalary(){
		return this.salary;
	}
	
	public void setEmployeeID(int employeeId){
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String name){
		this.name = name;
	}
	public void setEmployeeSalary(int salary){
		this.salary = salary;
	}
	
}
