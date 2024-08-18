package com.aurionpro.model;

import com.aurionpro.exceptions.CellAlreadyMarkedException;

public class Cell {
private MarkType mark;

public Cell(MarkType mark) {
	super();
	this.mark = MarkType.EMPTY;
}


public MarkType getMark() {
	return mark;
}


public void setMark(MarkType mark) {
	if (!isCellEmpty())
		throw new CellAlreadyMarkedException("Cell is Already Marked");
	this.mark = mark;
	
	//add Exception
}


public boolean isCellEmpty() {
	
	return this.mark==MarkType.EMPTY;	
}



}
