package org.interview;

public class StringRev {

	public static void main(String[] args) {

		String s = "welcome to programming class";
		String str = "";
		String[] split = s.split(" ");
		for (String a : split) {
			for (int i = a.length() - 1; i >= 0; i--) {
				char ch = a.charAt(i);
				str = str+ch;
			}
		}
		System.out.println(str);
	}
}
