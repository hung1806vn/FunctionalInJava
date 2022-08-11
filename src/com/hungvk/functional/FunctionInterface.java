package com.hungvk.functional;

import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;
		System.out.println(absoluteValue.apply(-3));
	}
}
