package COWAL;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCOWAL {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Student> c = new CopyOnWriteArrayList<>();
		c.add(new Student(1, "Aishawry"));
		c.add(new Student(15, "Mom"));
		c.add(new Student(13, "Bro"));
		c.add(new Student(188, "Cheap friends"));
		c.add(new Student(1234, "Sanjeev"));
		Iterator<Student> itr = c.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			c.add(new Student(1858, "Cheap friends"));
			c.add(new Student(126634, "Sanjeev"));
			c.remove(6);
		}
		System.out.println(c);
	}
}
