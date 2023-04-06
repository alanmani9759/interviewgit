package org.interview;

public class StringUpperCase {

	public static void main(String[] args) {
		String s = "welcome to programming class";
		String[] split = s.split(" ");
		
		for(String a : split) {
			char ca = a.charAt(0);
			char upperCase = Character.toUpperCase(ca);
			
			String substring = a.substring(1);
			
			String str = upperCase + substring;
			System.out.print(str + " ");
		}
	}
}
