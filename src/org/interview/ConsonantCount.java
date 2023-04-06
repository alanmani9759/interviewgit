package org.interview;

public class ConsonantCount {

	public static void main(String[] args) {
		String s = "Welcome to java class today";
		char[] ch = s.toCharArray();
		String s2 = "";
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')) {
					s2 += c;
				}
			}
		}
		System.out.println(s2);

	}
}
