package com.immutability;

final class Student {
	private int rno;
	private String name;
	Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public String getName() {
		return name;
	}
	
	public Student modify(int rno, String name) {
		if(this.rno == rno && this.name == name){
			return this;
		}else {
			return new Student(this.rno,this.name);
		}
	}
}
