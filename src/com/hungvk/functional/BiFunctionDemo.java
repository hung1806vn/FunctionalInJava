package com.hungvk.functional;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (x,y) -> x+y;
		System.out.println(add.apply(1, 2));
		
		TriFunction<Integer, Integer, Integer, Integer> sum = (x,y,z) -> x+y+z;
		System.out.println(sum.apply(1, 2, 3));
		
		NoArgsFunction<String> hello = () -> "hello";
		System.out.println(hello.apply());
	}
}
