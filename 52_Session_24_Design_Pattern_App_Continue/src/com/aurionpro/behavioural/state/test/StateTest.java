package com.aurionpro.behavioural.state.test;

import com.aurionpro.behavioural.state.model.Ordered;
import com.aurionpro.behavioural.state.model.Packet;

public class StateTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());

		packet.printStatus();
		packet.goToNextState();
		packet.printStatus();
		packet.goToNextState();
		packet.printStatus();
	}
}
