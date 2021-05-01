package com.design.patterns.creational.singleton;

public class MakeACaptain_Normal {

	private static MakeACaptain_Normal c;
	
	private MakeACaptain_Normal() {
	}
	
	public static MakeACaptain_Normal getCaptain() {
		if(c == null) {
			c = new MakeACaptain_Normal();
		}else {
			System.out.println("Captain already present.....!!");
		}
		return c;
	}
}
