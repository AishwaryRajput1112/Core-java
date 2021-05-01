package com.immutability;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student(1,"Aishwary");
		Student s2 = s.modify(1, "Aishwary");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}

}
