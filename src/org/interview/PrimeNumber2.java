package org.interview;

public class PrimeNumber2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % 2 == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}
}
