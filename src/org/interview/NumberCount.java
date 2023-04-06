package org.interview;

public class NumberCount {

	public static void main(String[] args) {
		int num = 739046788;
		int count = 0;
		while(num > 0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}
