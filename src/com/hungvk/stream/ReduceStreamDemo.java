package com.hungvk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStreamDemo {
	public static void main(String[] args) {
		Integer[] ar = { 1, 2, 3, 4, 5, 6 };
		List<Integer> lsI = Arrays.asList(ar);
		
		BinaryOperator<Integer> getSum = (acc,x) -> acc+x;
		
		Integer sum = lsI.stream().reduce(0, getSum);
		
		System.out.println(sum);
	}
}
