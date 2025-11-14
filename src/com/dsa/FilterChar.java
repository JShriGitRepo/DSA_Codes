package com.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class FilterChar {
	public static void main(String[] args) {
		List<String> datas = Arrays.asList("10", "200", "a", "3", "b", "H", "J"); // In java 8
//		List<String> datas = List.of("1", "a", "2", "b", "H"); // since Java 9
		List<String> result = datas.stream().filter(s -> s.matches("\\d+")).collect(Collectors.toList());
		List<String> result1 = datas.stream().filter(s -> s.matches("[a-z]")).collect(Collectors.toList());
		List<String> result2 = datas.stream().filter(s -> s.matches("[A-Z]")).collect(Collectors.toList());
		List<String> result3 = datas.stream().filter(s -> s.length() == 1).collect(Collectors.toList());
		List<String> result4 = datas.stream().filter(s -> s.length() == 2).collect(Collectors.toList());
		List<String> result5 = datas.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
//		System.out.println(result);
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
//		System.out.println(result5);

		Map<String, List<String>> res = new LinkedHashMap<>();
		res.put("Numbers", result);
		res.put("Lowercase", result1);
		res.put("Uppercase", result2);
		res.put("Length=1", result3);
		res.put("Length=2", result4);
		res.put("Length=3", result5);

//		System.out.println(res);
		for (Map.Entry<String, List<String>> entry : res.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}
}
