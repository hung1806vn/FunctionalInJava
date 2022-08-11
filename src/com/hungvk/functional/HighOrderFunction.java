package com.hungvk.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HighOrderFunction {
	public static void main(String[] args) {
		BiFunction<Float, Float, Float> divide = (x,y) -> x/y;
		Function<BiFunction<Float, Float, Float>,BiFunction<Float, Float, Float>> secArgIsZero 
		= (func) -> (x,y)->{
			if(y==0f) {
				System.out.println("cannot divide to zero");
				return 0f;
			}
			return func.apply(x,y);
		};
		BiFunction<Float, Float, Float> divideSafe = secArgIsZero.apply(divide);
		System.out.println(divideSafe.apply(3f, 0f));
	}
}
