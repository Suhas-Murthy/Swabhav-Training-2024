package com.aurionpro.model;

public class Box {
	private int width;
	private int height;
	private int depth;

	public Box(int w, int h, int d) {
		this.width = w;
		this.height = h;
		this.depth =d;
	}
	
	public Box() {
		this.width = 10;
		this.height = 20;
		this.depth =30;
	}
	
	public int getWidth() {
		return this.height;
	}

	public int getHeight() {
		return this.height;
	}

	public int getDepth() {
		return this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int calculateArea() {

		return this.width * this.height * this.depth;
	}
}
