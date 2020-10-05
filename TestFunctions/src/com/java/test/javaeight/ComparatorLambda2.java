/**
 * 
 */
package com.java.test.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author RoblesJ
 *
 */
public class ComparatorLambda2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				 
				return Integer.compare(o1.length(),o2.length());
			}
			
			
		};
		
		
		List<String> lisString =  Arrays.asList("**","*","***");
		
		List<String> list = new ArrayList<>();
		Collections.sort(lisString,comp);
		int i = 0;
		Consumer<String> c1 = s-> list.add(s+" "+i);
		lisString.stream().peek(c1).forEach(System.out::println);
		
		list.stream().forEach(System.out::println);

	}

}
