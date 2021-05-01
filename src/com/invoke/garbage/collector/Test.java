package com.invoke.garbage.collector;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Test {
	public static void main(String[] args) {
		Map<Student, Integer> hashMap = new HashMap<Student, Integer>();
		System.out.println("Sixe of map - "+hashMap.size());
		hashMap.put(new Student(1, "Aishwary"), 1);
		hashMap.put(new Student(101,"Sanjeev"), 2);
		hashMap.put(new Student(10,"Rahul"), 10);
		hashMap.put(new Student(1011,"Rohan"), 29);
		hashMap.put(new Student(1601,"Raman"), 56);
		hashMap.put(new Student(14401,"Chirag"), 69);
		hashMap.put(new Student(1, "Aishwary"), 33);
		System.out.println(hashMap);
		Runtime runtime = Runtime.getRuntime();
		runtime.freeMemory();
		runtime.gc();
		System.out.println(hashMap);
		Map<Student, Integer> identitiMap = new IdentityHashMap<Student, Integer>();
		identitiMap.put(new Student(1, "Aishwary"), 1);
		identitiMap.put(new Student(101,"Sanjeev"), 2);
		identitiMap.put(new Student(10,"Rahul"), 10);
		identitiMap.put(new Student(1011,"Rohan"), 29);
		identitiMap.put(new Student(1601,"Raman"), 56);
		identitiMap.put(new Student(14401,"Chirag"), 69);
		identitiMap.put(new Student(1, "Aishwary"), 33);
		System.out.println(identitiMap);
		Runtime runtime2 = Runtime.getRuntime();
		runtime2.freeMemory();
		runtime2.gc();
		System.out.println(identitiMap);
		Map<Student, Integer> hashTable = new Hashtable<Student, Integer>();
		System.out.println("Sixe of map - "+hashTable.size());
		hashTable.put(new Student(1, "Aishwary"), 1);
		hashTable.put(new Student(101,"Sanjeev"), 2);
		hashTable.put(new Student(10,"Rahul"), 10);
		hashTable.put(new Student(1011,"Rohan"), 29);
		hashTable.put(new Student(1601,"Raman"), 56);
		hashTable.put(new Student(14401,"Chirag"), 69);
		hashTable.put(new Student(1, "Aishwary"), 33);
		System.out.println(hashTable);
		Runtime runtime3 = Runtime.getRuntime();
		runtime3.freeMemory();
		runtime3.gc();
		System.out.println(hashTable);
		Map<Student, Integer> weakHashMap = new WeakHashMap<Student, Integer>();
		System.out.println("Sixe of map - "+weakHashMap.size());
		weakHashMap.put(new Student(1, "Aishwary"), 1);
		weakHashMap.put(new Student(101,"Sanjeev"), 2);
		weakHashMap.put(new Student(10,"Rahul"), 10);
		weakHashMap.put(new Student(1011,"Rohan"), 29);
		weakHashMap.put(new Student(1601,"Raman"), 56);
		weakHashMap.put(new Student(14401,"Chirag"), 69);
		weakHashMap.put(new Student(1, "Aishwary"), 33);
		System.out.println(weakHashMap);
		Runtime runtime4 = Runtime.getRuntime();
		runtime4.freeMemory();
		runtime4.gc();
		System.out.println(weakHashMap);
	}
}
