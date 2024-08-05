package com.aurionpro.assignment.session4;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int random = rd.nextInt(100) + 1;
		int guess;
		int count = 0;
int lives = 10;
		do {
			count++;
			System.out.println("Guess a number? ");
			guess = sc.nextInt();
			if (guess > random) {
				System.out.println("Sorry too high");
				lives--;
				System.out.println("lives left : "+lives);
			} else if (guess < random) {
				System.out.println("Sorry too  low");
				lives--;
				System.out.println("lives left : "+lives);
			} else {
				System.out.println("You won: in attempt: " + count);
			}

		} while (guess != random || lives == 0);
		System.out.println("Random number is: " + random);
	}
}
