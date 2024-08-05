package VowelConsonantChecker;

import java.util.Scanner;

public class VowelCheckerSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char character = sc.next().toLowerCase().charAt(0);

		switch (character) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a Vowel");

		}
	}
}
