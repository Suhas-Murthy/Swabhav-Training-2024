package com.aurionpro.behavioural.state.model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		System.out.println("Package as been Delivered");
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setState(new Dispatched());
		System.out.println("Package is moving on to dispatched state.");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Package is in Delivered State");

	}

}
