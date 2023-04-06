package org.interview;

import java.util.Set;
import java.util.TreeSet;

public class UniqueArray {

	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 4;
		a[5] = 3;
		a[6] = 5;

		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		System.out.println(s);
	}
}
