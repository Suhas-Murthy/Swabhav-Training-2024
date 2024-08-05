package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
	 	
		map.put(1,"Suhas");
		map.put(2,"Mahesh");
		map.put(3,"Jatin");
		map.put(4,"Gauraw");
		
		System.out.println(map);
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}
		
	}

}
