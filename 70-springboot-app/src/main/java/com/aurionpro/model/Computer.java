package com.aurionpro.model;

public class Computer {
private String name;
private Harddisk harddisk;


public Computer() {
	super();
	// TODO Auto-generated constructor stub
}
public Computer(String name, Harddisk harddisk) {
	super();
	this.name = name;
	this.harddisk = harddisk;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Harddisk getHarddisk() {
	return harddisk;
}
public void setHarddisk(Harddisk harddisk) {
	this.harddisk = harddisk;
}
@Override
public String toString() {
	return "Computer [name=" + name + ", harddisk=" + harddisk + "]";
}

}
