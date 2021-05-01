package com.shallow.bitwise.cloning;

public class Dog implements Cloneable {

	private Cat cat;
	private int dogNumber;
	public Cat getCat() {
		return cat;
	}
	public int getDogNumber() {
		return dogNumber;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public void setDogNumber(int dogNumber) {
		this.dogNumber = dogNumber;
	}
	public Dog(Cat cat, int dogNumber) {
		super();
		this.cat = cat;
		this.dogNumber = dogNumber;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
