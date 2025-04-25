package LeetCodeExc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 
 * 
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 * @author ringo
 *
 */
public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "egg";
		
		String t1 ="add";
		
		String s2 = "foo";
		
		String t2 ="bar";
		
		String s3 = "paper";
		
		String t3 ="title";
		
		
		System.out.println(isIsomorphic2(s3, t3));
		
	}

	
	
	// my solution n2
	public static boolean isIsomorphic(String s, String t) {
		
		
		//perserverd the charaters order
		//two charactes cant point to the same character but a character can map to itself
		
		
		
		Map<String,List<Integer>> mapS = new HashMap<>();
		Map<String,List<Integer>> mapT = new HashMap<>();
		
		
		for(int i=0; i<s.length(); i++){
			if(mapS.containsKey(s.charAt(i))){
				
				List<Integer>  tempList = mapS.get(s.charAt(i));
				tempList.add(i);
				
			}else{
				
				List<Integer> tempList = new ArrayList<>();
				tempList.add(i);
				mapS.put(s.charAt(i)+"", tempList);
			}
			
			if(mapT.containsKey(t.charAt(i))){
				
				List<Integer>  tempList = mapT.get(t.charAt(i));
				tempList.add(i);
				
			}else{
				
				List<Integer> tempList = new ArrayList<>();
				tempList.add(i);
				mapT.put(t.charAt(i)+"", tempList);
			}
			
		}
		
		for(int i=0; i<s.length(); i++){
			
			
			List<Integer> temS = mapS.get(s.charAt(i)+"");
			List<Integer> temT = mapT.get(t.charAt(i)+"");
			
			for(int j =0; j<temS.size(); j++){
				if(temS.get(j)!= temT.get(j)){
					return false;
				}
				
			}
			
		}
		
		return true;
	}
	
	
	
	
	
	// leet code solution O(n)
	 public static boolean isIsomorphic2(String s, String t) {
	        if (s.length() != t.length()) return false;

	        Map<Character , Character> hashtable = new HashMap<>();
	        for (int i = 0; i < s.length(); i++) 
	        {
	            char c1 = s.charAt(i);
	            char c2 = t.charAt(i);
	            
	            if (hashtable.containsKey(c1))
	            {
	                if (hashtable.get(c1) != c2) return false;
	            }else {
	                if (hashtable.containsValue(c2)) return false;
	                hashtable.put(c1 , c2);
	            }
	        }

	        return true;
	    }
	
}
