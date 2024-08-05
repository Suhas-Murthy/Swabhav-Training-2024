package com.aurionpro.structural.facade.model;

public class HomeThreaterController {
public void start() {
	Projector projector = new Projector();
	DVDPlayer dvdPlayer = new DVDPlayer();
	SoundSystem soundSystem = new SoundSystem();
	dvdPlayer.on();
	projector.on();
	soundSystem.start();
	dvdPlayer.start();
	projector.input(Source.HDMI);
	soundSystem.volume(60);
	
}
public void stop() {
	Projector projector = new Projector();
	DVDPlayer dvdPlayer = new DVDPlayer();
	SoundSystem soundSystem = new SoundSystem();
	dvdPlayer.off();
	projector.off();
	soundSystem.stop();
	
}
public void setVolume(int level) {

	SoundSystem soundSystem = new SoundSystem();
	soundSystem.volume(level);
}
}
