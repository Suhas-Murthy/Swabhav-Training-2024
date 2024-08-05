package com.aurionpro.behavioural.state.model;

public class Dispatched implements IPacketState {

	@Override
	public void next(Packet packet) {
		packet.setState(new Delivered());
		System.out.println("Package is out of delivery");
	}

	@Override
	public void previous(Packet packet) {
		packet.setState(new Ordered());
		System.out.println("Package is moving on to ordered state");
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Package is in Dispatched State");
		
	}

}
