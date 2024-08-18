package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.CellAlreadyMarkedException;
import com.aurionpro.exceptions.InvalidInputException;
import com.aurionpro.model.Board;
import com.aurionpro.model.MarkType;
import com.aurionpro.model.Player;
import com.aurionpro.model.ResultAnalyzer;
import com.aurionpro.model.ResultType;

public class TicTacToeTest {
	 public static void main(String[] args) {

	        Board board = new Board();
	        ResultAnalyzer analyzer = new ResultAnalyzer(board, ResultType.PROGRESS);

	        MarkType currentPlayer = MarkType.X;
	        ResultType gameResult = ResultType.PROGRESS;

	        Scanner scanner = new Scanner(System.in);

	        while (gameResult == ResultType.PROGRESS) {
	        	System.out.println("TIC TAC TOE GAME");
	            board.displayBoard();
	            System.out.println("Player " + currentPlayer + "'s turn. \nEnter Cell (0-8): ");
	            int cell = scanner.nextInt();

	            try {
	                board.setCellMark(cell, currentPlayer);
	                gameResult = analyzer.analyzeResult();

	                if (gameResult == ResultType.WIN) {
	                    board.displayBoard();
	                    System.out.println("Congratualations - Player " + currentPlayer + " Wins!!!!!");
	                } else if (gameResult == ResultType.DRAW) {
	                    board.displayBoard();
	                    System.out.println("Match is a Draw");
	                } else {
	                    currentPlayer = (currentPlayer == MarkType.X) ? MarkType.O : MarkType.X;
	                }

	            } catch (CellAlreadyMarkedException e) {
	                System.out.println("Cell is already marked, Please see the board and try again.");
	            } catch (InvalidInputException e) {
	                System.out.println("Invalid cell location, The input should be between (0-8) try again.");
	            }
	        }

	        scanner.close();
	    }
	}

