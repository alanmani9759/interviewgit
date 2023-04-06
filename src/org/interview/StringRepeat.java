package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringRepeat {

	public static void main(String[] args) {
		String s = "greens";
		
		Map<Character, Integer> mp = new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char ca = s.charAt(i);
			
//			more than one time present
			if ( mp.containsKey(ca)) {
				Integer count = mp.get(ca);
				mp.put(ca, count+1);
			}
			else {
				mp.put(ca, 1);
			}
		}
		System.out.println(mp);
	}
}
