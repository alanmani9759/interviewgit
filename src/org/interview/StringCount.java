package org.interview;

public class StringCount {

	public static void main(String[] args) {
		String s = "Welcome to java class @	OMR - 600123";
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int numbers = 0;
		int specialChar=0;
		
		
		for (int i = 0; i < s.length(); i++) {
			char ca = s.charAt(i);
			
			if (ca >= 'A' && ca<='Z') {
				uppercaseCount++;
			} else if (ca >='a' && ca<='z') {
				lowercaseCount++;
			} else if (ca>='0' && ca<='9') {
				numbers++;
			} else {
				specialChar++;
			}
			
		}
		System.out.println("upper case count:" + uppercaseCount);
		System.out.println("lower case count:" + lowercaseCount);
		System.out.println("numbers:" + numbers);
		System.out.println("special character count:" + specialChar);
	}
}
