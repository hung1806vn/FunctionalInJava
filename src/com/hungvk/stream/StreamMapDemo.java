package com.hungvk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapDemo {
	public static void main(String[] args) {
		Integer [] ar = {1,2,3,4,5,6};
		List<Integer> ls = Arrays.asList(ar);
		
		Function<Integer,Integer> timesTwo = (x) -> x*2;
		
		List<Integer> doubled = ls.stream().map(timesTwo).collect(Collectors.toList());
		
		System.out.println(doubled);
	}
}
