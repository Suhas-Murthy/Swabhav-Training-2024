package com.aurionpro.structural.proxy.model;

public class LibraryProxy implements Library {
    private RealLibrary realLibrary;
    private String studentName;
    private String role; 

    public LibraryProxy(String studentName, String role) {
        this.studentName = studentName;
        this.role = role;
        this.realLibrary = new RealLibrary();
    }
    public LibraryProxy(String studentName) {
    	this.studentName = studentName;
    	this.role = "Guest";
    	this.realLibrary = new RealLibrary();
    }

    @Override
    public void accessResource(String resourceName) {
        if (role.equals("Student") || role.equals("Faculty")) {
            System.out.println(studentName + " is accessing the resource.");
            realLibrary.accessResource(resourceName);
        } else {
            System.out.println("Access denied for " + studentName + ". Guests cannot access this resource.");
        }
    }
}

