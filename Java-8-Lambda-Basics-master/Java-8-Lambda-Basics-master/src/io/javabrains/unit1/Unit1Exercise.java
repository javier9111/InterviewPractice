package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.javabrains.common.Person;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		
		Collections.sort(people, (p,p2) -> p.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		people.forEach(System.out::println);
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		
		
		people.stream().
		filter(p -> p.getLastName().startsWith("C"))
		.forEach(System.out::println);

	}

}
