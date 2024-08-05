package com.aurionpro.model;

public class RunnableThread implements Runnable {

	private Thread thread;
	
	public RunnableThread(String name) {
		thread = new Thread(this);
		thread.start();
	}

	public Thread getThread() {
		return thread;
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}