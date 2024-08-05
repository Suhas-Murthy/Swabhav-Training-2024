package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamAppTest {
public static void main(String[] args) {
	List<String> students = Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
//	1
	students.stream().sorted().limit(3).forEach((student)->System.out.println(student));;
//2
	System.out.println("2nd");
	students.stream().sorted().limit(3).filter(student -> student.contains("a")).forEach((student)-> System.out.println(student));;;
	
//	3
	System.out.println("3rd");
	students.stream().sorted(Collections.reverseOrder()).forEach((student)->System.out.println(student));;
//	4
	System.out.println("4");
	students.stream().map(student->student.substring(0, 3)).forEach((student)->System.out.println(student));;
//	5
	System.out.println("5th");
	students.stream().filter(student->student.length()<=4).forEach((student)->System.out.println(student));;
}
}
