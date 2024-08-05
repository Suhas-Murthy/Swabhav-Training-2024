package com.aurionpro.assignment.session3;

import java.util.Scanner;

public class HuntTheTreasure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island.");
		System.out.println("Your Mission is to find the Treasure.");

		System.out.println("Choose one on the following where you want to go: ");
		System.out.println(" 1. Left  --> Press '1' to go left");
		System.out.println(" 2. Right --> Press '2' to go right");

		System.out.print("Enter your choice: ");
		int choiceLeftRight = sc.nextInt();

		if (choiceLeftRight == 1) {

			System.out.println("Choose one on the following what do you want to do: ");
			System.out.println(" 1. Swim --> Press '1' to swim");
			System.out.println(" 2. Wait --> Press '2' to wait");

			System.out.print("Enter your choice: ");
			int choiceSwinWait = sc.nextInt();

			if (choiceSwinWait == 2) {

				System.out.println("which door would you like to enter? : ");
				System.out.println(" 1. Red    --> Press '1' if red");
				System.out.println(" 2. Yellow --> Press '2' if yellow");
				System.out.println(" 3. Blue   --> Press '3' if blue");

				System.out.print("Enter your choice: ");
				int choiceRedYellowBlue = sc.nextInt();

				if (choiceRedYellowBlue == 1) {
					System.out.println("Your are burned by fire.");
					System.out.println("XXXXXX Game  Over XXXXXX");
				} else if (choiceRedYellowBlue == 2) {
					System.out.println("Congratulations!!!, You Win...");
				} else if (choiceRedYellowBlue == 3) {
					System.out.println("You are Eaten by Beasts");
					System.out.println("XXXXXX Game Over XXXXXX");
				} else
					System.out.println("XXXXX Game Over XXXXX");
			} else if (choiceSwinWait == 1) {
				System.out.println("Attacked by Trout");
				System.out.println("XXX Game Over XXX");
			} else {
				System.out.println("Attacked by Trout");
				System.out.println("XXX Game Over XXX");
			}
		} else if (choiceLeftRight == 2) {
			System.out.println("You Fell into a Hole.");
			System.out.println("XXXXX Game Over XXXXX");
		} else {
			System.out.println("You Fell into a Hole.");
			System.out.println("XXXXX Game Over XXXXX");
		}
		sc.close();
	}
}
