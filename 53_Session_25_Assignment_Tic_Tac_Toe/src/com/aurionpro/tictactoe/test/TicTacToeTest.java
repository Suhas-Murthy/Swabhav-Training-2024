package com.aurionpro.tictactoe.test;

import java.util.Scanner;

public class TicTacToeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = 3;
		int columns = 3;
		char board[][] = new char[rows][columns];

		
		initialBoard(board, rows, columns);

		char player = 'X';
		boolean gameOver = false;
		mainLogic(gameOver, board, rows, columns, player, scanner);
		;

	}

	private static void mainLogic(boolean gameOver, char[][] board, int rows, int columns, char player,
			Scanner scanner) {
		while (!gameOver) {
			printBoard(board, rows, columns);
			System.out.println("Player " + player+"'s turn: ");
			System.out.println("Enter row and column: ");
			// System.out.println("Enter row: ");
			int row = scanner.nextInt();
			// System.out.println("Enter Column: ");
			int column = scanner.nextInt();

			if (board[row][column] == '-') {
				board[row][column] = player;
				gameOver = haveWon(board, rows, columns, player);
				if (gameOver) {
					System.out.println(player + " won");
					printBoard(board, rows, columns);
				} else {
					if (player == 'X') {
						player = '0';
					} else {
						player = 'X';
					}
				}

			} else {
				System.out.println("Invalid Move by " + player + "Try Again");
			}
		}

	}

	private static boolean haveWon(char[][] board, int rows, int columns, char player) {
		for (int i = 0; i < rows; i++) {
			if ((board[i][0] == player && board[i][1] == player && board[i][2] == player)
					|| (board[0][i] == player && board[1][i] == player && board[2][i] == player)
					|| (board[0][0] == player && board[1][1] == player && board[2][2] == player)
					|| (board[0][2] == player && board[1][1] == player && board[2][0] == player))
				return true;
		}
		return false;
	}

	private static void printBoard(char[][] board, int rows, int columns) {
		System.out.print("  ");
		for (int n = 0; n < board.length; n++) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < rows; i++) {

			System.out.print(i + " ");
			for (int j = 0; j < columns; j++) {
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	private static void initialBoard(char[][] board, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = '-';
			}
		}
	}
}
