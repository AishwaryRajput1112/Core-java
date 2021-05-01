package com.comparable.and.comparator;

import java.util.Set;
import java.util.TreeSet;

public class TestComparabbleComparator {

	
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1034);
		s.setName("Aishwary");
		Student s2 = new Student();
		s2.setId(20);
		s2.setName("Rahul");
		Student s3 = new Student();
		s3.setId(677);
		s3.setName("Sanjeev");
		Student s4 = new Student();
		s4.setId(1034);
		s4.setName("Raman");
		
		Set<Student> set = new TreeSet<>(new StudentComparator());
		set.add(s);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
	}
}
