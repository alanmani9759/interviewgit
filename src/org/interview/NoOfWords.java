package org.interview;

public class NoOfWords {

	public static void main(String[] args) {
		String s = "welcome to java class";
		String[] split = s.split(" ");
		int length = split.length;
		System.out.println("Number of words in string " + length);
	}
}
