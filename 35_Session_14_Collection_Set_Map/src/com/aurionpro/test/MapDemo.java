package com.aurionpro.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
 	
	map.put("A", 100);
	map.put("B", 101);
//	if key is repeated its value will be updated
//	map.put("A", 111);
	map.put("C", 100);
	map.put("D", 600);
	map.put("E", 100);
	
	Map<String, Integer> map1 = new TreeMap<String, Integer>();
	map1.put("Z", 500);
	map1.put("C", 50);
	map1.put("A", 100);

	Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
	map2.put("D", 600);
	map2.put("E", 100);	
	map2.put("Z", 500);
	map2.put("C", 50);
	map2.put("A", 100);
	
	
	map2.putIfAbsent("A", 700);
	
	System.out.println(map);
	System.out.println(map1);
	System.out.println(map2);
}
}
