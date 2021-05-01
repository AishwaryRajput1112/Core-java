package com.thread.join;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Display d = new Display("Aishwary");
		Thread t = new Thread(d);
		t.setPriority(1);
		t.start();
		
		Thread.currentThread().setPriority(10);
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Main");
		}
	}
}
