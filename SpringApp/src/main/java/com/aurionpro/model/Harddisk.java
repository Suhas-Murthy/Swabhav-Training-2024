package com.aurionpro.model;

public class Harddisk {
private int capacity;



public Harddisk() {
	super();
	// TODO Auto-generated constructor stub
}

public Harddisk(int capacity) {
	super();
	this.capacity = capacity;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

@Override
public String toString() {
	return "HardDisk [capacity=" + capacity + "]";
}

}
