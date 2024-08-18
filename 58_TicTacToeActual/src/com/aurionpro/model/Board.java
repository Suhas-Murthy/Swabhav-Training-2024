package com.aurionpro.model;

import com.aurionpro.exceptions.InvalidInputException;

public class Board {
	Cell[] cell = new Cell[9];

	public Board() {
		for (int i = 0; i < cell.length; i++) {
			cell[i] = new Cell(MarkType.EMPTY);
		}

	}
	
	
	public Cell[] getCell() {
		return cell;
	}


	public  boolean isBoardFull() {
		for(Cell cell:cell) {
			if(cell.isCellEmpty())
				return false;
		}
		return true;
		
	}
	
	
	 public void setCellMark(int loc,MarkType mark) {
	        if (loc < 0 || loc >= cell.length) {
	            throw new InvalidInputException();
	        }
	        cell[loc].setMark(mark);
		
		
	 }
	 
	    public void displayBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(cell[i * 3 + j].getMark() + "\t");
	            }
	            System.out.println();
	        }
	    }
}
