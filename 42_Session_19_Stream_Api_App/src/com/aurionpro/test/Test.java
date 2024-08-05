package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10,2,1,3,5,6,7);
	
//	Stream<Integer> numberStream = numbers.stream();
//	numberStream.forEach((number)-> System.out.println(number));

	//	or
	
//	numbers.stream().forEach((number)->System.out.println(number));
//	numbers.stream()
//	.filter((number)->(number%2!=0))
//	.forEach((number)->System.out.println(number));
	
	List<Integer> filteredNumbers = numbers.stream()
	.filter((number)->(number%2!=0))
	.filter((number)->(number>35))
	.collect(Collectors.toList());
	
	filteredNumbers.forEach((number)->System.out.println(number));
	
	List<Integer> squareNumbers = numbers.stream()
			.map((number)->number*number)
			.collect(Collectors.toList());
	
	squareNumbers.forEach((number)->System.out.print(number+ " "));
	System.out.println();
	
	int sum = numbers.stream().reduce(0, (number1,number2)->number1+number2);
	System.out.println("Sum: "+sum);
	
	System.out.println(squareNumbers.stream().reduce(0,(number1,number2)->number1+number2));
	
	numbers.stream().sorted()
					.forEach((number)->System.out.print(number));
	System.out.println();
	System.out.println("Reverse Sorted values: ");
	numbers.stream().sorted(Collections.reverseOrder()).forEach((number)->System.out.println(number));
	System.out.println("Top 3");
	numbers.stream().sorted().limit(3).forEach((number)->System.out.println(number));
	
	Optional<Integer> max = numbers.stream().max((number1,number2)->number1-number2);
	if(max.isPresent())
		System.out.println("Max is: "+max.get());
	
	Optional<Integer> min = numbers.stream().min((number1,number2)->number1-number2);
	if(min.isPresent())
		System.out.println("Min is: "+min.get());
}
}
