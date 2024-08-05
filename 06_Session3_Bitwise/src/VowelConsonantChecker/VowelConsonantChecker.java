package VowelConsonantChecker;

import java.util.Scanner;

public class VowelConsonantChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	char character = sc.next().toLowerCase().charAt(0);
	
	
	
	if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ) {
		System.out.println(character +" is a Vowel");
	}
	else {
		System.out.println("NOt an Vowel");
	}
}
}
