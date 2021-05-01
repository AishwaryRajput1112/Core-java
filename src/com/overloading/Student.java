package com.overloading;

public class Student {

	String name;

	public void checkName(String name) {
		System.out.println("String........");
	}

	public void checkNAme(Object o) {
		System.out.println("Object........");
	}

	public void print(double d) {
		System.out.println("double........");
	}

	public void print(byte b) {
		System.out.println("byte........");
	}

	public void print(char c) {
		System.out.println("char........");
	}
}
