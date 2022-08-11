package com.hungvk.functional;

public class Closure {
	
	
	public static void main(String[] args) {
		NoArgsFunction<NoArgsFunction<String>> createGreeter = () -> {
			String name = "HungVK";
			return ()-> "hello "+ name;
		};
		
		NoArgsFunction<String> hello = createGreeter.apply();
		System.out.println(hello.apply());
	}
}
