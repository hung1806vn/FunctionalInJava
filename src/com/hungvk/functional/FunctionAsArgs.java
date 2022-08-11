package com.hungvk.functional;

import java.util.function.BiFunction;

public class FunctionAsArgs {
	protected static class MyMath{
		public static Integer add(Integer x ,Integer y) {
			return x+y;
		}
		public static Integer substract(Integer x ,Integer y) {
			return x-y;
		}
		
		public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combine) {
			return combine.apply(2,3);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MyMath.combine2And3(MyMath::add));
		System.out.println(MyMath.combine2And3(MyMath::substract));
		System.out.println(MyMath.combine2And3((x,y)-> x*2 + y*2));
	}
}
