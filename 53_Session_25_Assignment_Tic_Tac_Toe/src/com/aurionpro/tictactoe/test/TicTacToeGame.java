package com.aurionpro.tictactoe.test;

import com.aurionpro.tictactoe.model.TicTacToe;

public class TicTacToeGame {
	public static void main(String[] args) {

		TicTacToe tictactoe = new TicTacToe();
		tictactoe.initializeBoard();
		tictactoe.mainLogic();
	}
}
