package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeMavenModelTest {
	TicTacToeMavenModel ticTacToeGame;

	@BeforeEach
	void before() {
		ticTacToeGame = new TicTacToeMavenModel();
	}
	
	
	@Test
	void testInitializeBoard() {
//		char[][] expected = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
		char[][] expected = new char[3][3];
		for(int i =0 ; i < expected.length ; i++) {
			for (int j = 0; j < expected.length; j++) {
				expected[i][j] = '-';
			}
		}
		char[][] actual = ticTacToeGame.getBoard();
		assertArrayEquals(expected, actual);
	}

//	@Test
//	void testPrintBoard() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testMainLogic() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testHaveWon() {
//		fail("Not yet implemented");
//	}

}
