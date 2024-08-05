package com.aurionpro.test;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	Consumer<Integer> consumer = (Integer number) -> System.out.println("Square of the number "+number+" is " + number*number);
	consumer.accept(scanner.nextInt());
}
}