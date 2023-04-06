package org.interview;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num /= 10;
		}
		if (rev == temp) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
	}
}
