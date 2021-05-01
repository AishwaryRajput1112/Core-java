package com.design.patterns.behavioural.observer;

public class Test {

	public static void main(String[] args) {
		
		Observer observer = new Observer();
		Subject subject = new Subject();
		subject.register(observer);
		subject.setFlag(25);
		subject.setFlag(5);
		subject.unregister(observer);
		subject.setFlag(10);
		
	}
}
