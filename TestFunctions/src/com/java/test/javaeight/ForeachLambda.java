package com.java.test.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> strings = Arrays.asList("one","two","three","four","five");
		
		List<String> result  = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println; //s -> System.out.println(s); // 
		Consumer<String> c2 = result::add; // result::add;
		
		strings.forEach(c1.andThen(c2));
		System.out.println("size of the result = "+result.size());
	}

}
