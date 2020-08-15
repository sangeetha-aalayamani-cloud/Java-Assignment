package com.sample;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter_02 {

	public static void main(String[] args) {
		
		String str1 = "Define success on your own terms, achieve it by your own rules, and build a life you’re proud to live";
		
		String str2 = "The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty";
		
		countWords(str1);
		countWords(str2);

	}
	
	private static Map<String,Integer> countWords(String str) {
		Map<String,Integer> map = new HashMap<>();
		
		String[] s = str.split(" ");
		for (int i = 0; i < s.length - 1; i++) {
			if (map.containsKey(s[i])) {
				int count = map.get(s[i]);
				map.put(s[i], count+1);
		    } else 
		      {
		        map.put(s[i], 1);
		      }
		    }
			System.out.println(map);
			
			return map;
		}	
}
