package com.aurionpro.commandlineargs;

public class AreaOfCircle {
	public static void main(String[] args) {
		
		int radius = Integer.parseInt(args[0]);
		double area =  3.14*radius*radius;
		System.out.println("Area Of Circle : "+area);
	}
	
}
