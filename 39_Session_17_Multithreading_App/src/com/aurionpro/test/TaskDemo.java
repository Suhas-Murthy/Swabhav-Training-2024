package com.aurionpro.test;

import com.aurionpro.model.Task;

public class TaskDemo {
public static void main(String[] args) {
	
	//To execute 10 tasks we have created 10 threads
	for(int i=0;i<10;i++) {
	Thread thread = new Thread(new Task());
	thread.start();
//	try {
//		thread.sleep(500);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
}
}
