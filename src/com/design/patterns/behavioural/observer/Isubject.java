package com.design.patterns.behavioural.observer;

public interface Isubject {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
}
