package com.hungvk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterDemo {
	public static void main(String[] args) {
		String[] wordsArr = { "hello", "is", "cool", "functional", "programing" };
		List<String> ls = Arrays.asList(wordsArr);

		Integer[] ar = { 1, 2, 3, 4, 5, 6 };
		List<Integer> lsI = Arrays.asList(ar);

		Predicate<Integer> isEven = x -> x % 2 == 0;
		List<Integer> evens = lsI.stream().filter(isEven).collect(Collectors.toList());
		
		System.out.println(evens);
		
		Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
			return (t -> t.length()>minLength);
		};
		
		List<String> longWords = ls.stream().filter(createLengthTest.apply(5)).collect(Collectors.toList());
		
		System.out.println(longWords);
	}
}
