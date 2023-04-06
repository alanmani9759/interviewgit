package org.interview;

public class Palindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		String rev = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			char c = ch[i];
			rev += c;
		}
		System.out.println(rev);

		if (s.equals(rev)) {
			System.out.println("It is a palindrome number.");
		} else {
			System.out.println("It is not a palindrome number");
		}
	}
}
