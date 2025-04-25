package CodeWars.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/***
 * 
 * Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 * 
 * @author ringo
 *
 */
public class FindTheOddInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] a = {7};
		
		System.out.println(findIt(a));
	}

	public static int findIt(int[] a) {
		
		
		Map<Integer,Integer> mapInts = new HashMap<Integer,Integer>();
		
		
		for(int i=0; i<a.length; i++)
		{
			if(mapInts.get(a[i])== null)
			{
				mapInts.put(a[i], 1);
			}else
			{
				mapInts.put(a[i],mapInts.get(a[i])+1);
			}
		}
		
		
		for(Entry<Integer,Integer> entry : mapInts.entrySet()){
			
			if(entry.getValue()%2 ==1)
			{
				return entry.getKey();
			}
		}
		
		
		
		
		
		
	  	return 0;
	  }
	
}
