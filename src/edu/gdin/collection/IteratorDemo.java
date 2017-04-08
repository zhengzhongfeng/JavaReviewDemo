package edu.gdin.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void testIterator(){
		List l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		testIterator();
	}
}
