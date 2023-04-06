package org.interview;

public class MaxNumArray {

	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 500;
		ar[3] = 400;
		ar[4] = 800;
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					ar[i] = temp;
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[0]);
	}
}
