package com.aurionpro.solution.model;

public class DbLogger implements ILogger{

	@Override
	public void log(String err) {
		System.out.println(err);
		
	}

}
