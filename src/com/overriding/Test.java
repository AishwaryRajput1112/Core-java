package com.overriding;

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		a.m();
		B b = new B();
		b.m();
		C c = new C();
		c.m();
		A a1 = new B();
		a1.m();
		A a2 = new C();
		a2.m();
		B b2 = new C();
		b2.m();
		Object o1 = new C();
		((A) o1).m();
	}
}
