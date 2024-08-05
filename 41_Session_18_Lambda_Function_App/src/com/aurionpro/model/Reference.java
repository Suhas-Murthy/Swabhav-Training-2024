package com.aurionpro.model;

public class Reference {
public Reference() {
	System.out.println("Inside Constructor");
}

public static void StaticPrint() {
	System.out.println("Inside Static");
}
public void Print() {
	System.out.println("Inside Non Static");
	
}

@Override
public String toString() {
	return "Reference [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}


}
