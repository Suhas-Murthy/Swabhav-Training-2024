package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.NewTask;
import com.aurionpro.model.Task;

public class CallableExecuterDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
//		Future<Integer> future = service.submit(new NewTask());
		
		
		List<NewTask> tasks = new ArrayList<NewTask>();
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());

		try {
//			System.out.println(future.get());
			// service.invokeAny (tasks);
			List<Future<Integer>> futures =  service.invokeAll(tasks);
			for(Future<Integer> future: futures) 
				System.out.println(future.get());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		  for (int i = 0; i < 100; i++) {
//			   service.submit(new Task());
//			 }
	}

}
