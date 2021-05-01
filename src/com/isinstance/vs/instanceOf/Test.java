package com.isinstance.vs.instanceOf;

public class Test {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(101);
		s.setName("Aishwary");
		
		if(s instanceof Student) {
			System.out.println(s.getId() + s.getName());
		}
		
		if(Student.class.isInstance(s)) {
			System.out.println(s.getId()  + s.getName());
		}
		
	}
	
	
}
