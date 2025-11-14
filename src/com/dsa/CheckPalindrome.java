package com.dsa;

public class CheckPalindrome {
	public static void main(String[] args) {
	String str = "madam";
	String res = new StringBuilder(str).reverse().toString();
	System.out.println(str.equals(res) ? "Palindrome" : "NotPalindrome");
	}
}
