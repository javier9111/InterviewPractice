package com.java.test.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = Arrays.asList();
		//Optional class is needed when the default values are not always needed.
		
		Optional<Integer> red = list.stream().reduce( Integer::max);
		
		System.out.println("red = "+red);
	}

}
