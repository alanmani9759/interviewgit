package org.interview;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 12;
		int count = 0;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("it is a prime number");
		} else {
			System.out.println("it is not a prime number");
		}
	}
}
