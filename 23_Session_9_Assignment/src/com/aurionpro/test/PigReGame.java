package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

class Details {
	static int totalScore = 0;
	char userInput = 0;
	// int count = 0;
	static int score = 0;
	static Details turn = 1;
	static int randomNumber = 0;
	public int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class PigReGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		Details detail = new Details();


		// System.out.println(randomNumber);

		System.out.println("Let's Play PIG!");

		System.out.println("TURN " + detail.turn);

		Details.turn = loopGameLogic(detail.userInput, scanner, detail.randomNumber, rand, detail.score, detail.totalScore, detail.turn);

		System.out.println("Congratulations");
		System.out.println("You won in total turn " + (detail.turn));
		scanner.close();
	}

	// ------------------------------------------------------------------------------------------------------------------------------------//
	private static int dieCondition(Details randomNumber, int score) {
		if (Details.randomNumber != 1) {
			System.out.println("Die: " + randomNumber);
			Details.score = Details.score + Details.randomNumber;
			return Details.score;
		}
		System.out.println("Die: " + Details.randomNumber);
		System.out.println("Turn over. No score.");
		System.exit(0);

		return Details.score;

	}

	private static int turnIncrementer(int score, Details turn) {
		if (Details.score <= 20) {
			return turn++;

		}
		return turn;
	}

	//

	private static Details loopGameLogic(char userInput, Scanner scanner, int randomNumber, Random rand, int score,
			int totalScore, Details turn) {
		do {
			System.out.print("Roll or hold? (r/h): ");
			userInput = scanner.next().charAt(0);
			if (userInput == 'r') {
				randomNumber = rand.nextInt(6) + 1;
				score = dieCondition(randomNumber, score);
			} else if (userInput == 'h') {
				System.out.println("Score for Turn = " + score);
				Details.totalScore = Details.score;
				System.out.println("Total score: " + totalScore);
				turn = turnIncrementer(score, turn);
				System.out.println("TURN " + turn);
			}

		} while (Details.totalScore <= 20);

		return turn;
	}

}
