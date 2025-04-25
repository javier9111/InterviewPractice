package io.javabrains.playground;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import io.javabrains.common.Person;

public class PersonUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1 = new Person("p1","p1l",20);
		Person p2 = new Person("p2","p1l",30);
		Person p3 = new Person("p3","p1l",40);
		Person p4 = new Person("p4","p1l",50);
		Person p5 = new Person("p5","p1l",56);
		Person p6 = new Person("p6","p1l",60);
		Person p7 = new Person("p7","p1l",65);
		Person p9 = new Person("p9","p1l",23);
		Person p10 = new Person("p10","p1l",25);
		Person p11 = new Person("p11","p1l",26);
		Person p12 = new Person("p12","p1l",26);
		Person p13 = new Person("p13","p1l",36);
		Person p14 = new Person("p14","p1l",67);
		Person p15 = new Person("p15","p1l",43);
		Person p16 = new Person("p16","p1l",53);
		Person p17 = new Person("p17","p1l",42);
		Person p18 = new Person("p18","p1l",33);
		Person p19 = new Person("p19","p1l",61);
		Person p20 = new Person("p20","p1l",34);
		Person p21 = new Person("p21","p1l",27);
		Person p22 = new Person("p22","p1l",10);
		
		
		
		List<Person> list = new ArrayList<>();
		list.add(p1 );
		list.add(p2 );
		list.add(p3 );
		list.add(p4 );
		list.add(p5 );
		list.add(p6 );
		list.add(p7 );
		list.add(p9 );
		list.add(p10);
		list.add(p11);
		list.add(p12);
		list.add(p13);
		list.add(p14);
		list.add(p15);
		list.add(p16);
		list.add(p17);
		list.add(p18);
		list.add(p19);
		list.add(p20);
		list.add(p21);
		list.add(p22);

		
		
		List<Person> result = list.stream()
				.filter(i -> i.getAge()>20 && i.getAge()<40)
				//.map(i -> new Person(i.getFirstName(), "updated", i.getAge()))
				.map(i -> {
					i.setFirstName(i.getFirstName());
					i.setLastName("updated");
					return i;
					
				})
				.sorted(Comparator.comparingInt(Person::getAge) )
				.collect(Collectors.toList());
		
		Optional<Person> oldest = result.stream().reduce((acumulador, next) -> {
			
			if(acumulador.getAge()>next.getAge())
				return acumulador;
			else
				return next;
			
		});
				
			
		System.out.println(oldest.get().getAge());
		
result.stream().forEach(System.out::println);




		
		
		
		
		
	}

}
