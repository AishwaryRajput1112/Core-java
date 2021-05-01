package com.string.programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordsInString {
	public static void main(String[] args) {

		String s = "Aishwary is a is a top level bloke bloke";
		String[] abc = s.split(" ");
		Map<String, String> print = new HashMap();
		Map<String, String> duplicate = new HashMap();
		for (int i = 0; i < abc.length; i++) {
			String word = abc[i].toLowerCase();
			if(duplicate.get(word)==null) {
				if(print.get(word)==null) {
					print.put(word, word);
				}else {
					duplicate.put(word, word);
				}
			}
		}
		System.out.println(duplicate);
		System.out.println(print);
	}
}
