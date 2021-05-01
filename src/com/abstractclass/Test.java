package com.abstractclass;

public class Test {

	public static void main(String[] args) {
		
		Calculator c = new SquareIt();
		System.out.println(c.add(10, 20));
		System.out.println(c.substract(20, 40));
		System.out.println(c.calculatedAreaOfSquare(20, 20));
		
	}
}
