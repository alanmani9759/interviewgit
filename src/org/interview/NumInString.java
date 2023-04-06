package org.interview;

public class NumInString {

	public static void main(String[] args) {
		String s = "Welcome123hi";
		String s2 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char a = ch[i];
			if (a >= '0' && a <= '9') {
				s2 = s2 + a;
			}
		}
		System.out.println(s2);
	}
}
