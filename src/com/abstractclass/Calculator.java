package com.abstractclass;

public abstract class Calculator {

	int a , b;
	
	public Calculator() {}
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public int substract(int a, int b) {
		return a-b;
	}
	
	public abstract double calculatedAreaOfSquare(int a, int b);
}
