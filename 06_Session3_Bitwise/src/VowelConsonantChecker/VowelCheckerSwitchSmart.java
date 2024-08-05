package VowelConsonantChecker;

import java.util.Scanner;

public class VowelCheckerSwitchSmart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char character = sc.next().toLowerCase().charAt(0);

		switch (character) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a Vowel");

		}
	}
}
