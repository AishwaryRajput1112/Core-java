package com.thread.join;

public class Display implements Runnable{
	
	String name;

	public Display(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
