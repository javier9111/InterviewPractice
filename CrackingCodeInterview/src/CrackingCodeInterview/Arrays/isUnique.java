package CrackingCodeInterview.Arrays;

import java.util.Arrays;

/**
 * implement and  algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional  data structures? 
 * @author ringo
 *
 */
public class isUnique {
 
	
	public static void main (String[] args){
		
		
		
		String myString  = "1234asdasd";
		
	System.out.println(	isUniqueString(myString));
		System.out.println( isUniqueChars(myString));
	}	
	
	/***
	 * Your solution
	 * @param string
	 * @return
	 */
	static boolean isUniqueString(String string ){
		
		
		char[] charArray = string.toCharArray();
		
		Arrays.sort(charArray);
		
		int temp=-1;
		for(int i=0; i<charArray.length; i++){
			
			if(temp == charArray[i])
			{
				return false;
			}
			temp = charArray[i];
		}
		
		return true;
	}
	
	/**
	 * CCI solution
	 * @param str
	 * @return
	 */
	static boolean isUniqueChars(String str){
		
		if (str.length()>128) return false; //the 128 constant reffers to the 128 letters in the alfabet, you can extend to 256 for ASCII
		
		boolean [] char_set = new boolean[128];//we are using a 128 bolean values so the position on the array will give us the check position if it was already there
		
		for(int i=0; i<str.length(); i++){// already found this char in string 
			
			int val= str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val]= true;
		}
		return true;
	}
}
