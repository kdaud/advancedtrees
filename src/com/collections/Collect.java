package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Collect {
	
	public void collect() {
		Collection<String> student = new ArrayList<>();
		
		student.add("Daud");
		Set<Integer> marks = new HashSet<>();
		marks.add(2);
		marks.add(9);
		marks.add(5);
		marks.add(8);
		marks.add(1);
		marks.add(7);
		marks.add(3);
		marks.add(1);
		for (int jj : marks) {
			System.out.println(jj);
		}
	}
	
}
