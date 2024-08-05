package com.aurionpro.assignment.session6;

import java.util.Scanner;

public class CharacterShifter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String word = "abc";

		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}

		sc.close();
	}
}
