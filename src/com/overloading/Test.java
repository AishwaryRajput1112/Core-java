package com.overloading;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();
		s.checkName("Aishwary");
		s.checkNAme(null);
		s.checkNAme(new Student());
		byte b = 10;
		s.print(b);
		s.print('f');
		s.print(1.23456789); 
	}
}
