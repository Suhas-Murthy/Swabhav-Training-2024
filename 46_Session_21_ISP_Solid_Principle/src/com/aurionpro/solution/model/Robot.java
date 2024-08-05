package com.aurionpro.solution.model;

public class Robot implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Robot Started Working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stopped Working");
		
	}

}
