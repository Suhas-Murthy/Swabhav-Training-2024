package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names.size());
		System.out.println(names);
		names.add("Suhas");
		names.add("Subodh");
		names.add("Yadullah");
		names.add("Gauraw");
		names.add("Mitali");
		System.out.println(names.size());
		System.out.println(names);
		names.add(2, "Jatin");
		System.out.println(names);
		names.add("Hero");
		System.out.println(names);
//		names.clear();
		System.out.println(names.get(1));
		System.out.println(names);
	}

}
