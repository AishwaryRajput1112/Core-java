package com.object.creations;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		
		Test t = new Test();
		Test t2= (Test) t.clone();
		Test t3 = (Test)Class.forName("com.Test").newInstance();
		Runtime r = Runtime.getRuntime();
		
	}
}
