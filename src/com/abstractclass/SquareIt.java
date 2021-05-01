package com.abstractclass;

public class SquareIt extends Calculator {

	@Override
	public double calculatedAreaOfSquare(int a, int b) {
		int c = a*b;
		return Double.valueOf(c);
	}

}
