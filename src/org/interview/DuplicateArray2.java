package org.interview;

public class DuplicateArray2 {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 4;
		a[2] = 3;
		a[3] = 4;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
