package com.aurionpro.test;

import com.aurionpro.model.IGreeting;

public class GreetingTest {
public static void main(String[] args) {
	
	//Anonymns Class
//	IGreeting greet =new IGreeting() {
		
//		@Override
//		public void say(String name) {
//				System.out.println("Hello  " + name);
//		}
//	};
	
		//Now using Lambda Function
//		IGreeting greet = name -> System.out.println("Hello "+name);
//	OR
		IGreeting greet = (name) -> {System.out.println("Hello "+name);};
//		IGreeting greet = () -> {System.out.println("h");};
		
	greet.say("World");
//	greet.say();
}
}
