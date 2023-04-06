package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {
		String s = "java class and java selenium class";
		
		String[] split = s.split(" ");
		
		Map<String,Integer> mp = new LinkedHashMap<>();
		
		for (String str : split) {
			if (mp.containsKey(str)) {
				Integer count = mp.get(str);
				mp.put(str, count+1);
			} else {
				mp.put(str, 1);
			}
		}
		System.out.println(mp);
	}
}
