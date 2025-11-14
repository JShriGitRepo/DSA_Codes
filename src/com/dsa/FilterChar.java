package com.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class FilterChar {
	public static void main(String[] args) {
		List<String> datas = Arrays.asList("1", "2", "a", "3", "b","H","J"); // In java 8
//		List<String> datas = List.of("1", "a", "2", "b", "H"); // since Java 9
		List<String> result = datas.stream().filter(s -> s.matches("\\d+")).collect(Collectors.toList());
		List<String> result1 = datas.stream().filter(s -> s.matches("[a-z]")).collect(Collectors.toList());
		List<String> result2 = datas.stream().filter(s -> s.matches("[A-Z]")).collect(Collectors.toList());
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}
}
