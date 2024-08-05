package com.aurionpro.behavioural.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setState(new Dispatched());
		System.out.println("Package is moving on to dispatched state.");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("Package is already in ordered state");
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Package is in Ordered State");
		
	}

}
