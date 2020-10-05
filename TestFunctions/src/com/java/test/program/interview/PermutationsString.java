package com.java.test.program.interview;

import java.util.Set;

/***
 * This Program will find all the permutations that can be found in a word
 * @author ringo
 *
 */
public class PermutationsString {

	
	
	public static void main(String[] args)
	{
		
		String permutacion = "lala";
		
		permutation(permutacion);
	}
	
	
	/*
	 * * A method exposed to client to calculate permutation of String in Java.
	 */ public static void permutation(String input) {
		permutation("", input);
	}

	/*
	 * * Recursive method which actually prints all permutations * of given
	 * String, but since we are passing an empty String * as current permutation
	 * to start with, * I have made this method private and didn't exposed it to
	 * client.
	 */ private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
//			System.err.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				System.out.println( "first param " +perm + word.charAt(i)+ " second param: "+word.substring(0, i) + word.substring(i + 1, word.length()) +" counter :"+i);
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

}
