/**
 * 
 */
package com.java.test.functions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RoblesJ
 *
 */
public class OneEdit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = isOneEditApart("abc","acb");
		System.out.println("they are at one edit apart?:"+result);
	}

	
	
	public static boolean isOneEditApart(String wordOne, String wordTwo)
	{
		
		int edits = 0;
		
		 if(wordOne.equals(wordTwo))
		 {
			 return false;
		 }
		 if(wordOne.length()-wordTwo.length()>1 || wordOne.length()-wordTwo.length() <-1 )
		 {
			 return false;
		 }
		 if(wordOne.length()>=wordTwo.length())
		 {
			 for(int i=0; i<wordOne.toCharArray().length; i++)
			 {
				 if(i== wordTwo.length())
				 {
					 edits++;
				 }
				 else if(wordTwo.toCharArray()[i]!=wordOne.toCharArray()[i])
				 {
					 edits++;
				 }
			 }
		 }
		 else
		 {
			 for(int i=0; i<wordTwo.toCharArray().length; i++)
			 {
				 if(i== wordOne.length())
				 {
					 edits++;
				 }
			 else if( wordTwo.toCharArray()[i]!=wordOne.toCharArray()[i])
				 {
					 edits++;
				 }
			 } 
		 }
		return edits==1;
	}
}
