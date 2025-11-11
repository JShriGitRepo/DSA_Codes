package com.dsa;

import java.util.List;
import java.util.stream.Collectors;

public class FilterTwoDigitStrings {
	public static void main(String[] args) {
		List<String> datas = List.of("100","20","a","3","b");
		List<String> result = datas.stream().filter(s -> s.length()==3).collect(Collectors.toList());
		System.out.println(result);
	}
}
