package org.interview;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 9474;
		int arm = 0;
		int temp = num;
		while (num > 0) {
			int n = num % 10;
			arm = arm + (n * n * n * n);
			num /= 10;
		}
		if (arm == temp) {
			System.out.println("it is a amstrong number.");
		}
	}
}
