package com.aurionpro.session7.string;

public class StringHashCheck {
public static void main(String[] args) {
//	String name1 = "AT";
//	String name2 = "AT";
//	String name3 = "B";
//	System.out.println(name3.hashCode());
//	name3 = name3 + "M";
//	System.out.println(name1.hashCode()); // hashcode is the location in the heap memory where the content is stored.
//	System.out.println(name2.hashCode());
//	System.out.println(name1 == name2);
//	System.out.println(name3.hashCode());
	
//	String name1 = new String("AT");
//	String name2 = new String("AT");
//	System.out.println(name1 == name2);
	
//	StringBuffer name1 = new StringBuffer("Suhas");
//	System.out.println(name1.hashCode());
//	name1 = name1.append("Murthy");
//	System.out.println(name1.hashCode());
	
	StringBuilder name1 = new StringBuilder("Suhas");
	System.out.println(name1.hashCode());
	name1 = name1.append("Murthy");
	System.out.println(name1.hashCode());
	
	
	
}
}
