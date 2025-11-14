package com.dsa;

public class ReverseWordString {
	public static void main(String[] args) {
		String str = "madam";
		String res = new StringBuilder(str).reverse().toString();
		System.out.println(res);
	}

}
