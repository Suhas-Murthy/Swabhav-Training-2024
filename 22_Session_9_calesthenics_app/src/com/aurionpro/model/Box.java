package com.aurionpro.model;

public class Box {
	private int width;
	private int height;
	private int depth;

	public Box() {
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}

	public Box(int width, int height, int depth) {
		this();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Box(int width, int height) {
		this();// Construct Chaining
		this.width = width;
		this.height = height;
	}

}
