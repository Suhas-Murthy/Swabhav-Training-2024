package com.aurionpro.test;

import com.aurionpro.model.MyThread;

public class ThreadDemo {
public static void main(String[] args) {
	
	MyThread thread1 = new MyThread("Thread1");
	MyThread thread2 = new MyThread("Thread2");
	MyThread thread3 = new MyThread("Thread3");
	
//	System.out.println(thread);
//	thread.setName("MyThread");
//	
//	System.out.println(thread);
//	
	for(int i=5;i>0;i--) {
		System.out.println(Thread.currentThread().getName()+":"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
