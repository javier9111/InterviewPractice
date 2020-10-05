/**
 * 
 */
package com.java.test.hackerRank;

/**
 * @author ringo
 * A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array [1,2,3,4,5] , 
 * then the array would become [3,4,5,1,2].
 * Given an array a of n integers and a number, d, perform d left rotations on the array.
 * Return the updated array to be printed as a single line of space-separated integers.
 */
public class ArraysLeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {41 ,73, 89, 7 ,10 ,1, 59, 58, 84, 77, 77, 97, 58, 1 ,86 ,58, 26 ,10 ,86, 51};
		//        {73, 89, 7 ,10 ,1, 59, 58, 84, 77, 77, 97, 58, 1 ,86 ,58, 26 ,10 ,86, 51, 41}
		int d = 10;
		
//		int[] a = {1, 2 ,3 ,4 ,5};
//		int d = 4;
		a = rotLeft(a, d);
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
    static int[] rotLeft(int[] a, int d) {

    		int realMovments = d%a.length;
    		System.out.println("real movements :"+realMovments);
    		for(int i=0; i<realMovments; i++)
    		{

    			int tempMov	= a[0];
    				for(int j=0; j<a.length-1; j++)
    				{
    					
    					
    					a[j] = a[j+1]; 
    							
    				}
    			a[a.length-1] = tempMov;
 

    		}
    	
    	return a;
    }

}
