package com.aurionpro.structural.facade.model;

public class SoundSystem {
	public void start() {
		System.out.println("Sound System is On Now.");
	}
	public void stop() {
		System.out.println("Sound System is Off Now.");
	}
	
	public void volume(int level) {
		System.out.println("SoundSystem has a volume of : "+level);
	}
	
}
