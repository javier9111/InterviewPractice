package com.java.test.javaeight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingCollector {

	
	
	
	public static void main (String ... string)
	{
		List<Person> persons = new ArrayList<>();
		
		try (
				//java 7 for try catch on buffered readers in parenthesis 
				BufferedReader reader = new BufferedReader ( new InputStreamReader(MappingCollector.class.getResourceAsStream("people.txt")));
				
				Stream<String> stream = reader.lines();
			)
		{
			stream.map(line -> {
				String[] s = line.split(" ");
				Person p = new Person(s[0].trim(),Integer.parseInt(s[1]));
				persons.add(p);
				return p;
			}).forEach(System.out::println);
		}
		catch(IOException ioe)
		{
			System.err.println(ioe);
		}
		
		Stream<Person> stream = persons.stream();
		
		Optional<Person> opt = 
		stream.filter(p -> p.getAge() >= 20)
			  .min(Comparator.comparing(Person::getAge));
		
		System.out.println(opt);
		
		
		
		
		//grouping by the age
		Map<Integer, List<Person>> map = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(map);
		
		//grouping by the age and counting them.
		Map<Integer, Long> map2 = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println(map2);
		
		//grouping by age and get a list of names
		Map<Integer, List<String>> map3 = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName,Collectors.toList())));
		System.out.println(map3);
		
		
		//grouping by age and get a list of names
		Map<Integer, Set<String>> map4 = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName,Collectors.toCollection(TreeSet::new))));
		System.out.println(map4);
		
		
	}
	
}
