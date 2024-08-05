package com.aurionpro.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		///Randomly sequence is printed
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(88);
		set.add(9);
		set.add(4);
		set.add(5);
		
		System.out.println(set);
		
		///Sequence is as per the user entered
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(3);
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set1.add(3);
		System.out.println(set1);
		
		
		///Ordered Set - sorted set always with Tree Set
		TreeSet<String> set2 = new TreeSet<String>();
		TreeSet<String> set3 = new TreeSet<String>();
		TreeSet<Integer> set4 = new TreeSet<Integer>();
		set2.add("Suhas");
		set2.add("Mahesh");
		set2.add("Suresh");
		set2.add("Mohan");
		set2.add("Amrutha");
		
		set3.add("Jatin");
		set3.add("Gauraw");
		set3.add("Bhakti");
		set3.add("Subodh");
		set3.add("Yadullah");
		
		set4.add(1);
		set4.add(2);
		System.out.println(set2.contains("Suhas"));
		System.out.println(set2);
		System.out.println(set2.hashCode());
//		cannot be used to merge two sets of diff datatypes
//		System.out.println(set2.addAll(set1));
		System.out.println(set2);
		
		
		
		
		
	}

}
