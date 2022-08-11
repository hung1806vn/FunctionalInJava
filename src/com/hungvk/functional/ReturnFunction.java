package com.hungvk.functional;

import java.util.function.Function;

public class ReturnFunction {

	protected static class MyMath {
		public static Integer timesTwo(Integer x) {
			return x * 2;
		}

		public static Integer timesThree(Integer x) {
			return x * 3;
		}

		public static Integer timesFour(Integer x) {
			return x * 4;
		}
		
		public static Function<Integer, Integer> createMultiplier (Integer y){
			return x -> x*y;
			
		}
	}

	public static void main(String[] args) {
		NoArgsFunction<NoArgsFunction<String>> createPrinter = () -> {
			return () -> "hello";
		};

		NoArgsFunction<String> hello = createPrinter.apply();
		System.out.println(hello.apply());
		Function<Integer,Integer> timesTwo = MyMath.createMultiplier(2);
		Function<Integer,Integer> timesThree = MyMath.createMultiplier(3);
		Function<Integer,Integer> timesFour = MyMath.createMultiplier(4);
		
		System.out.println(timesTwo.apply(6));
		System.out.println(timesThree.apply(6));
		System.out.println(timesFour.apply(6));
	}
}
