/**
 * 
 */
package com.java.test.hackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ringo
 *Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers
 * representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 */
public class SalesbyMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		int[] ar = {10, 20 ,20 ,10, 10 ,30 ,50 ,10 ,20};
		
		System.out.println(sockMerchant(n, ar));
	}
	
	
    static int sockMerchant(int n, int[] ar) {
    	
        Map<Integer, Integer> colorMatches = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<ar.length; i++)
        {
        	if(colorMatches.get(ar[i])!= null)
        	{
        		colorMatches.put(ar[i], colorMatches.get(ar[i])+1);
        	}
        	else
        	{
        		colorMatches.put(ar[i], 1);
        	}
        	
        }
        
        int pairs = 0;
        for(Map.Entry<Integer, Integer> value :   colorMatches.entrySet())
        {
        	if(value.getValue() != 1)
        	{
        	pairs += value.getValue()/2;
        	}
        	System.out.println( "this is the key "+value.getKey() +" this is the value from values "+value + " And this is pair" + pairs + " operation "+ value.getValue()/2);
        }
        
        return pairs;

    }

}