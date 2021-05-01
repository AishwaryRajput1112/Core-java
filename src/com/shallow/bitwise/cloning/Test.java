package com.shallow.bitwise.cloning;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat cat = new Cat();
		cat.setName("Marry");
		
		Dog dog = new Dog(cat, 1);
		System.out.println("Dog " + dog);
		System.out.println("Cat " + cat);
		System.out.println("Dog's cat " +dog.getCat());
		
		Dog dog2 = (Dog) dog.clone();
		System.out.println("Dog " + dog2);
		System.out.println("Cat " + cat);
		System.out.println("Dog's cat " +dog.getCat());
	}
}
