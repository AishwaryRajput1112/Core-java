package com.string.programs;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Aishwary is a top level bloke";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);
	}
}
