package com.serialize;

import java.io.IOException;

public class Test{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		MySerializable mySerializable = new MySerializable();
		Student student = new Student();
		mySerializable.serialize(student);
		
		
		Student aish = mySerializable.deserialize();
		System.out.println(aish);
	}
	
}
