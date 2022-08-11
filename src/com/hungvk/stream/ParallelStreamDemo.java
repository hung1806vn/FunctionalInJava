package com.hungvk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		String[] wordsArr = { "hello", "is", "cool", "functional", "programing" };
		List<String> ls = Arrays.asList(wordsArr);
		
		List<String> rs = ls.parallelStream().map(x->{
			System.out.println("Processing " + x);
			return x;
		})
		.map(x->{
			System.out.println("Adding exclamation " + x);
			return x+"!";
		})
		.collect(Collectors.toList());
		
		System.out.println(rs);
	}
}
