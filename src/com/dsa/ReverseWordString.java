package com.dsa;

public class ReverseWordString {
	public static void main(String[] args) {
		String str = "Welcome to Java";
		String res = new StringBuilder(str).reverse().toString();
		System.out.println(res);
	}

}
