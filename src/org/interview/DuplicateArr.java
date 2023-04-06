package org.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArr {

	public static void main(String[] args) {
		int[] ar = new int[8];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 60;
		ar[5] = 10;
		ar[6] = 30;
		ar[7] = 40;

		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < ar.length; i++) {
			s.add(ar[i]);
		}
		for (Integer newArr : s) {
			System.out.println(newArr);
		}
	}
}
