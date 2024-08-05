package com.aurionpro.assignment.session4;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = { "hello", "mobile", "java", "swabhav" };
		Random rd = new Random();
		int random = rd.nextInt(4);
		String temp = words[random];
		System.out.println(words[random]);
		int lengthOfWord = temp.length();
		String wordGuess = "";

		for (int i = 1; i <= lengthOfWord; i++) {
			System.out.print("_");
		}
		System.out.println();
		while (temp != wordGuess) {
			System.out.println("Guess the word");
			System.out.print("Enter a letter: ");
			char guess = sc.next().charAt(0);
			for (int i = 0; i < lengthOfWord; i++) {
				if (temp.charAt(i) == guess) {
					System.out.print(temp.charAt(i));
					wordGuess += temp.charAt(i);
				} else {
					System.out.print("_");
					wordGuess += "_";
				}
			}
			System.out.println();
//			System.out.println(wordGuess);
			System.out.println();
		}
	}
}
