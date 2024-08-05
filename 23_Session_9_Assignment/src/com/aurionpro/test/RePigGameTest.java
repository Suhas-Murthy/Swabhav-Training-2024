package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class RePigGameTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		int randomNumber = 0;

		// System.out.println(randomNumber);

		System.out.println("Let's Play PIG!");

		int totalScore = 0;
		char userInput = 0;
		// int count = 0;
		int score = 0;
		int turn = 1;
		System.out.println("TURN " + turn);

		turn = loopGameLogic(userInput, scanner, randomNumber, rand, score, totalScore, turn);

		System.out.println("Congratulations");
		System.out.println("You won in total turn " + (turn));
		scanner.close();
	}

	// ------------------------------------------------------------------------------------------------------------------------------------//
	private static int dieCondition(int randomNumber, int score) {
		if (randomNumber != 1) {
			System.out.println("Die: " + randomNumber);
			score = score + randomNumber;
			return score;
		}
		System.out.println("Die: " + randomNumber);
		System.out.println("Turn over. No score.");
		System.exit(0);

		return score;

	}

	private static int turnIncrementer(int score, int turn) {
		if (score <= 20) {
			turn++;

		}
		return turn;
	}

	//

	private static int loopGameLogic(char userInput, Scanner scanner, int randomNumber, Random rand, int score,
			int totalScore, int turn) {
		do {
			System.out.print("Roll or hold? (r/h): ");
			userInput = scanner.next().charAt(0);
			if (userInput == 'r') {
				randomNumber = rand.nextInt(6) + 1;
				score = dieCondition(randomNumber, score);
			} else if (userInput == 'h') {
				System.out.println("Score for Turn = " + score);
				totalScore = score;
				System.out.println("Total score: " + totalScore);
				turn = turnIncrementer(score, turn);
				System.out.println("TURN " + turn);
			}

		} while (totalScore <= 20);

		return turn;
	}

}
