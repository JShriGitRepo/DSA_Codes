package com.dsa;

public class StringRotationTracker {
	public static boolean areRotations(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		String doubled = s1 +s1; //abcdabcd 
		return doubled.contains(s2); // Check if s2 is substring
	}
	
	public static void main(String[] args) {
		System.out.println(areRotations("abcd", "cdab"));
		System.out.println(areRotations("ijkl","ljki"));
	}
}
