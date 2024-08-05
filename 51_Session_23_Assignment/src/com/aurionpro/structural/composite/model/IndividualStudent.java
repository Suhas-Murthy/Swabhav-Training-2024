package com.aurionpro.structural.composite.model;

public class IndividualStudent implements Student {
	private String name;
    private int rollNumber;

    public IndividualStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public void showDetails() {
        System.out.println("Student: " + name + ", Roll Number: " + rollNumber);
    }
}
