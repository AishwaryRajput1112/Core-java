package com.design.patterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		MakeACaptain_Normal c = MakeACaptain_Normal.getCaptain();
		MakeACaptain_Normal c2 = MakeACaptain_Normal.getCaptain();
		System.out.println(c);
		System.out.println(c2);
	}
}
