package org.interview;

public class NumRev2 {

	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		while (num > 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num/= 10;
		}
		System.out.println(rev);
	}
}
