package com.java.test.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MappingjavaEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> stream = Stream.of("one","two","three","four","five");
		
		Stream<String> stream2 = Stream.of("one","two","three","four","five");
		
		Predicate<String> p1 = s -> s.length() >3;
		Predicate<String> p2 = Predicate.isEqual("two");
		Predicate<String> p3 = Predicate.isEqual("one");
		Predicate<String> p4 = Predicate.isEqual("three");
		
		//stream.filter(p2.or(p3)).forEach(System.out::println);
		
		
		// use of peek, peek does not return anything and we can use it to do basic operation
		List<String> list = new ArrayList<>();
		
		stream2
			.peek(System.out::println) //peek uses the consumer, and consumer only takes values and does not retreive anything
			.filter(p2.or(p3).or(p4)) //filter use a predicate
			.forEach(list::add);//for each is a consumer as well.
		
		System.out.println("Done!");
		System.out.println("size = "+list.size() );
		
	}

}
