package com.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class FilterChar {
	public static void main(String [] args) {
		List<String> datas = Arrays.asList("1","2","a","3","b"); // In java 8
//		List<String> datas = List.of("1","2","a","3","b");  // since Java 9
		List<String> result = datas.stream().filter(s -> s.matches("[a-z]")).collect(Collectors.toList());
		System.out.println(result);
	}
}
