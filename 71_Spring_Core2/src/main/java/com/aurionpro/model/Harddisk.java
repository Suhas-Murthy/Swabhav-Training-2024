package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harddisk {
	
//	@Value("10") // if we give here it is setter injection
private int capacity;




public Harddisk() {
	super();
}

@Autowired
public Harddisk(@Value("10") int capacity) {
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
	return "Harddisk [capacity=" + capacity + "]";
}


}
