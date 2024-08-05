package com.aurionpro.assignment.session4;

import java.util.Scanner;
import java.util.Random;

public class GuessTheWord {

	    public static void main(String[] args) {
	        // Start
	        String[] words = {"java", "programming", "correct", "swabhav", "techlabs", "aurionpro"};
	        Random random = new Random();
	        String word = words[random.nextInt(words.length)]; // Generate a random word

	        char[] blanks = new char[word.length()]; // Generate as many blanks as letters in the word
	        for (int i = 0; i < blanks.length; i++) {
	            blanks[i] = '_';
	        }

	        int lives = 6; // Number of lives
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            // Ask user to guess a letter
	            System.out.print("Current word: ");
	            System.out.println(blanks);
	            System.out.print("Guess a letter: ");
	            char guessedLetter = scanner.next().charAt(0);

	            // Check if the guessed letter is in the word
	            boolean found = false;
	            for (int i = 0; i < word.length(); i++) {
	                if (word.charAt(i) == guessedLetter) {
	                    blanks[i] = guessedLetter;
	                    found = true;
	                }
	            }

	            if (!found) {
	                lives--; // Lose a life if the guessed letter is not in the word
	                System.out.println("Wrong guess. You lost a life. Lives left: " + lives);
	                if (lives == 0) {
	                    System.out.println("You've run out of lives. Game over.");
	                    break;
	                }
	            } else {
	                // Check if all blanks are filled
	                boolean allFilled = true;
	                for (char c : blanks) {
	                    if (c == '_') {
	                        allFilled = false;
	                        break;
	                    }
	                }
	                if (allFilled) {
	                    System.out.println("Congratulations! You've guessed the word: " + word);
	                    break;
	                }
	            }
	        }
	        scanner.close();
	    }
	}

