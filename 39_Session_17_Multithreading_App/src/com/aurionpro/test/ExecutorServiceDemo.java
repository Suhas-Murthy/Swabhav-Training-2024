package com.aurionpro.test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task;

public class ExecutorServiceDemo {

	 public static void main(String[] args) {
		 
//		 int coreCount = Runtime.getRuntime().availableProcessors();
//		 System.out.println("Available Proceesors : "+coreCount); 
		 //we can have a control
//	  ExecutorService service = Executors.newFixedThreadPool(coreCount);

//	  ExecutorService service = Executors.newCachedThreadPool();
		 
		 
	  ExecutorService service = Executors.newSingleThreadExecutor();
	  for (int i = 0; i < 100; i++)
	   service.execute(new Task());
	 }

	}