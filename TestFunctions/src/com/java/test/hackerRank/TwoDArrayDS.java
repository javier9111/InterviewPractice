/**
 * 
 */
package com.java.test.hackerRank;

/**
 * @author ringo
 * Given a 6x6 2D Array arr: 
 *
 *An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation:
 *There are 16 hourglasses in arr . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every 
 *hourglass in arr, then print the maximum hourglass sum. The array will always be 6x6.
 *
 *
 */
public class TwoDArrayDS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr2D = {{0, -4 ,-6 ,0 ,-7 ,-6},{-1 ,-2, -6 ,-8, -3, -1},{-8,-4 ,-2, -8, -8 ,-6},{-3 ,-1 ,-2 ,-5,-7 ,-4},{-3 ,-5, -3,-6 ,-6 ,-6},{-3 ,-6 ,0 ,-8, -6, -7}};
		System.out.println("here");
		System.out.println(hourglassSum(arr2D));
		

		System.out.println("There");
	}
	
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

    	int row3 =0, row2= 0, row1=0;
    	int maxsum = 0, currentSum= 0;
    	int i=0;
    	for(int j=0; j<4;)
    	{
    		if(i<=3 )
    		{

    			
    			
	    		row1 = arr[j][i]+arr[j][i+1]+arr[j][i+2];
	    		
	    		row2 = arr[j+1][i+1];
	    		row3 = arr[j+2][i]+arr[j+2][i+1]+arr[j+2][i+2];
	    		
	    		System.out.println(arr[j][i]+" "+arr[j][i+1]+" "+arr[j][i+2]);
	    		System.out.println("  "+arr[j+1][i+1]);
	    		System.out.println(arr[j+2][i]+" "+arr[j+2][i+1]+" "+arr[j+2][i+2]);
	    		
	    		
	    		currentSum = row1+row2+row3;
	    		System.out.println("Contador rows: "+j+" count of colums :"+i+" row1: "+row1+" row2: "+row2+" row3: "+row3+" currentSum:"+currentSum);
	    		
	    	
	    		
	    		if(j==0 &&i== 0)
	    		{
	    			maxsum=currentSum;
	    		}
	    		else if(currentSum> maxsum)
	    		{
	    			maxsum = currentSum;
	    		}
	    		i++;   
    		}
    		else{
    			
    			i=0;
    			j++;
    		}
			

 		
    		
    	}
    	return maxsum;
    }

}
