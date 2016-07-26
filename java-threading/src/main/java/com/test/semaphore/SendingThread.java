package com.test.semaphore;

public class SendingThread extends Thread {

	Semaphore semaphore = null;

	public SendingThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Sending Signal !!!");
			this.semaphore.take();

		}
	}
}
