package com.dsa;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String s = "Helloworld";
		Long vowels = s.toLowerCase().chars().filter(c -> "aeiou" .indexOf(c)!= -1).count();
		Long constants = s.length() - vowels;
		System.out.println("Vowels Count = " + vowels);
		System.out.println("Constants Count = " + constants);
		
		
	}

}
