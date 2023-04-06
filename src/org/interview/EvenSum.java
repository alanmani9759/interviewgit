package org.interview;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Then sum of even number between 1-100 is " + sum);
	}
}
