package com.custom.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer age = Integer.parseInt(sc.next());
		if(age>40) {
			
		}else {
			throw new CustomException("Age not matching");
		}
	}
}
