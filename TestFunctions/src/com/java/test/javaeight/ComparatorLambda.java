package com.java.test.javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Comparator <String> comp = new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				return Integer.compare(o1.length(), o2.length());
			}
			
			
		};
		
		
		Comparator<String> compLamba = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
		List<String> list = Arrays.asList("***","**","****","*");
		
		Collections.sort(list,compLamba);
		
		for(String s : list){
			System.out.println(s);
		}
	}

}
