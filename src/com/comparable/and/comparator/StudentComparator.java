package com.comparable.and.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Integer i1 = o1.getId();
		Integer i2 = o2.getId();
		if (i1 > i2) {
			return +1;
		} else if (i1 < i2) {
			return -1;
		} else if (null != o1 && null != o2) {
			return o1.getName().compareTo(o2.getName());
		}
		return 0;
	}

}
