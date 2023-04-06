package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class VowelValues {

	public static void main(String[] args) {
		String s = "Welcome to java class today";
		char[] ch = s.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				if (mp.containsKey(c)) {
					Integer integer = mp.get(c);
					mp.put(c, integer + 1);
				} else {
					mp.put(c, 1);
				}
			}
		}
		System.out.println(mp);
	}
}
