package com.string.programs;

import java.util.Arrays;

public class CountWords {

	public static void main(String[] args) {
		int counter = 0;
		String s = "Aishwary is a top level bloke";
		
		String [] newString = s.split(" ");
		
		for(String str : Arrays.asList(newString)) {
			counter++;
		}
		System.out.println(counter);
		
		
		
	}
}
