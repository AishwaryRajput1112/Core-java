package com.strict.fp;

public strictfp class Test {

	public strictfp static void main(String[] args) {
		
		m(1.23456789f);
	}
	
	public static strictfp void m(float f) {
		System.out.println(f);
	}
	
	
}
