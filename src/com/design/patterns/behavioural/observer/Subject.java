package com.design.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Isubject {
	private int flag;
	private List<Observer> list = new ArrayList<>();
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public void register(Observer observer) {

	}

	@Override
	public void unregister(Observer observer) {

	}

	@Override
	public void notifyObservers() {

	}

}
