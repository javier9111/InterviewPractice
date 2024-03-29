package com.java.test.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapJaveEigth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2, 4, 6);
		List<Integer> list3 = Arrays.asList(3, 5, 7);
		
		
		List<List<Integer>> list = Arrays.asList(list1,list2,list3);
		
		System.out.println(list);
		
		Function<List<?>, Integer> size = l -> l.size();
		
		//here we are compiling the values of each individual streams.
		Function< List<Integer>, Stream<Integer> > flatmapper = l -> l.stream();
		
		//Here I have the function size, and how it represents the size of each list
		list.stream().map(size)
			.forEach(System.out::println);
		
		list.stream().flatMap(flatmapper)
		.forEach(System.out::println);
	
	}

}
