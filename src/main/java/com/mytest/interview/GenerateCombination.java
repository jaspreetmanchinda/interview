package com.mytest.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenerateCombination {

	public Set<String> validEnglishcombinations (String word) {
		
		Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
		Map<Character, Integer> dictMap = new HashMap<Character, Integer>();
		Set<String> allEnglisgCombo = new HashSet<String>();
		String [] dict =  Dictionary.dictionary();
		for(char cWord : word.toCharArray()) {
			if(wordMap.containsKey(cWord)) {
				wordMap.put(cWord, wordMap.get(cWord)+1);
			}else {
				wordMap.put(cWord, 1);
			}
			
		}
		
		for(String dictWord:dict) {
			dictMap = new HashMap<Character, Integer>();
			for(char c : dictWord.toCharArray()) {
				if(dictMap.containsKey(c)) {
					dictMap.put(c, wordMap.get(c)+1);
				}else {
					dictMap.put(c, 1);
				}
				
			}
			boolean flag = false;
			for(char c :dictMap.keySet()) {
				
				if(wordMap.containsKey(c)&&wordMap.get(c)>=dictMap.get(c)) {
					flag = true;
					
				}else {
					flag=false;
					break;
				}
					
			}
			
			if(flag)
				allEnglisgCombo.add(dictWord);
		}
		return allEnglisgCombo;
	}
	
	public static void main(String[] args) {
		GenerateCombination gb = new GenerateCombination();
		//Below can be changed to user input
		System.out.println(gb.validEnglishcombinations("abc"));
	}
}
