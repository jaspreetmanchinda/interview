package com.mytest.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionary {
	
	public static boolean isEnglishWord(String word) {
		

		List<String> dict = Arrays.asList(dictionary()).stream().map(s -> s.toLowerCase()).collect(Collectors.toList());;
		
		if(dict.contains(word))
			return true;
		else 
			return false;
	}
	
	public static String [] dictionary() {
		
		String [] dict = {"abc","a","ab","gf","af"};
		
		return dict;
	}

}
