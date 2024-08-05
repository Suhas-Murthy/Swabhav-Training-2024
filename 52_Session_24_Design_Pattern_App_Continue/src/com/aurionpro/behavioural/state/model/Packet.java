package com.aurionpro.behavioural.state.model;

public class Packet {
IPacketState state;

public Packet(IPacketState state) {
	super();
	this.state = state;
}


public IPacketState getState() {
	return state;
}


public void setState(IPacketState state) {
	this.state = state;
}


public void goToNextState() {
	state.next(this);
}
public void goToPreviosState() {
	state.previous(this);
}

public void printStatus() {
	state.current(this);
}
}
