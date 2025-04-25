package CrackingCodeInterview.Arrays;

import java.util.Arrays;

/***
 * Given two string, check if one is the permutation of the other
 * @author ringo
 *
 */
public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "asdasd";
		String s2 = "asadsd";
		
		
		System.out.println(checkPermutation(s1, s2));
		
		System.out.println(checkPermutation2(s1, s2));
	}

	/**
	 * your solution
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean checkPermutation(String s1, String s2)
	{
		
		if(s1.length() != s2.length()) return false;
		
		
		char[] temps1 = s1.toCharArray();
				Arrays.sort(temps1); 

				
		char[] temps2 = s2.toCharArray();
				Arrays.sort(temps2); 
		
		for(int i=0; i<temps1.length; i++)
		{
			if(temps1[i]!=temps2[i])
			{
				return false;
			}
		}
		
						
						
		return true;
	}
	
	/***
	 * CCI solution
	 * @param s1
	 * @param s2
	 * @return
	 */
	
	public static String sort(String s){

		char[] content = s.toCharArray();
				Arrays.sort(content); 

				return new String(content);
				
	}
	public static boolean checkPermutation2(String s1, String s2)
	{
		
		if(s1.length() != s2.length()) return false;
		
		
						
						
		return sort(s1).equals(sort(s2));
	}
}
