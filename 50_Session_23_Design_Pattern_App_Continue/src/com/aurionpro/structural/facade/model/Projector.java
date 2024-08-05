package com.aurionpro.structural.facade.model;

public class Projector {

	public void on() {
		System.out.println("Projector is On Now.");
	}
	public void off() {
		System.out.println("Projector is Off Now.");
	}
	public void input(Source source) {
		System.out.println("Projector is connected to input "+ source.HDMI);
	}
}
