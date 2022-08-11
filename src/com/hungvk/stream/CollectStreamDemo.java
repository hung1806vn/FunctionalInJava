package com.hungvk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectStreamDemo {
	public static void main(String[] args) {
		String[] wordsArr = { "hello", "is", "cool", "functional", "programing" };
		List<String> ls = Arrays.asList(wordsArr);
		
		Map<Integer, List<String>> map = ls.stream().collect(Collectors.groupingBy(x -> x.length()));
		Map<Boolean, List<String>> mapBool = ls.stream().collect(Collectors.partitioningBy(x -> x.length()>5));
		
		System.out.println(map);
		System.out.println(mapBool);
	}
}
