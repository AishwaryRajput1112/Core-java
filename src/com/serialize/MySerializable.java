package com.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class MySerializable{

	public void serialize(Student s) throws IOException {
		s.setId(101);
		s.setLoginPassword("A@1R#2R$0");
		s.setUsername("R878828");
		File file = new File("abc.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s);
		objectOutputStream.close();
	}
	
	public Student deserialize() throws IOException, ClassNotFoundException {
		File file = new File("abc.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student s = (Student)objectInputStream.readObject();
		return s;
	}
	
	
}
