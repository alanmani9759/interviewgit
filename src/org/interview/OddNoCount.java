package org.interview;

public class OddNoCount {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
              count++;
			}
		}
		System.out.println("the odd number count is:" + count);
	}
}
