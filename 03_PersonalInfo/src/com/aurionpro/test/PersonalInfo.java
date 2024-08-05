package com.aurionpro.test;

public class PersonalInfo {
	static String lname = "Murthy";
	static String fname = "Suhas";
	static String city = "Mumbai";
	static int pincode = 401107;
	static long mobile = 8097027284L;
	byte var = 25;
	double var1 = 3399.5;
	float var2 = 45.6F;
	
	public static void main(String[] args) {
		System.out.println("Name: "+ fname +" "+ lname);
		System.out.println("City: "+ city +" , "+ pincode);
		System.out.println("Mobile: "+ mobile);
	}
}
