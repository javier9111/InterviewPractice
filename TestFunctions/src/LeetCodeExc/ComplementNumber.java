package LeetCodeExc;

import java.util.HashMap;
import java.util.Map;

/***
 * 
 * find the numbers from an array that will sum and be equal to the number given.
 * exmpl.
 * from the given array {1,3,4,6,7,5}
 * given number 11
 * result will be {7,4} or {6,5}
 *
 */
public class ComplementNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,3,4,6,7,5};
    int[] result = {0,0};
    Map<Integer,Integer> map = new HashMap<>();
    int complementNumber = 0;
    
	    for(int i=0; i<arr.length; i++)
		    {
		    	complementNumber = 11-arr[i];
		    	if(i == 0)
		    	{
		    		map.put(arr[i], complementNumber);
		    	}
		    	else{
		    		if(map.containsKey(complementNumber))
		    		{
		    			result[0]=arr[i];
		    			result[1] =complementNumber; 
		    			break;
		    		}
		    		map.put(arr[i], complementNumber);
		    	}
		    }
	    System.out.println(result[0]+","+result[1]);
	}

}
