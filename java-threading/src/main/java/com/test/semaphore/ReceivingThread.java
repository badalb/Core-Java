package com.test.semaphore;

public class ReceivingThread extends Thread {

	Semaphore semaphore = null;

	public ReceivingThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("Receiving Signal");
				this.semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
