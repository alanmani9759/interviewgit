package org.interview;

public class AlphaCount {

	public static void main(String[] args) {
		String s1 = "Azarara@132gmail.com";
		int s = 0, c = 0, n = 0, ch = 0;
		String small = "", caps = "", num = "", splCr = "";
		for (int i = 0; i < s1.length(); i++) {
			char a = s1.charAt(i);
			if (a >= 97 && a <= 122) {
				s++;
				small = small + a;
			}
			if (a >= 65 && a <= 90) {
				c++;
				caps += a;
			}
			if (a >= 48 && a <= 57) {
				n++;
				num += a;
			} else {
				ch++;
				splCr += a;
			}
		}
		System.out.println("small==>" + s + "==>" + small);
		System.out.println("capital==>" + c + "==>" + caps);
		System.out.println("digits==>" + n + "==>" + num);
		System.out.println("special characters==>" + ch + "==>" + splCr);
	}
}
