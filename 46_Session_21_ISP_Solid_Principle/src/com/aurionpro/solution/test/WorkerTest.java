package com.aurionpro.solution.test;

import com.aurionpro.solution.model.Labour;
import com.aurionpro.solution.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		Labour labour;
		labour = new Labour();
		System.out.println("Labour");
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		System.out.println();
		Robot robot = new Robot();
		System.out.println("Robot");
		robot.startWork();
		robot.stopWork();
		

	}

}
