package com.trycatchfinally;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside 1st try ...");
			
			int a = 10/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Inside catch 1st");
			return;
		}finally {
			System.out.println("Inside 1st finally...");
		}
		
		
	}
}
