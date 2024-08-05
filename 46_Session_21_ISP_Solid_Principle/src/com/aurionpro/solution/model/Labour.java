package com.aurionpro.solution.model;

public class Labour implements IWorkable, ILunchInterval{

	@Override
	public void startWork() {
		System.out.println("Labour Started Working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Labour Stopped Working");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is Eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour is Drinking");
		
	}

}
