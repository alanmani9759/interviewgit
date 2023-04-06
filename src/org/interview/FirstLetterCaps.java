package org.interview;

public class FirstLetterCaps {

	public static void main(String[] args) {
		String s1 = "welcome to java class today";
		String s2 = "";
		String[] s3 = s1.split(" ");
		
		for (String s4 : s3) {
			char c = s4.charAt(0);
			char uc = Character.toUpperCase(c);
			String ss = s4.substring(1);
			s2=s2+uc+ss;
		}
		System.out.println(s2);

	}
}
