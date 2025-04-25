package CodeWars.Arrays;

import java.util.Arrays;

/***
 * 
 * // given an array of integers [1, 4, 5, 6, 7] find the min and max of the sum of  any 4 elements
// output should be [min, max] format
// example output [16, 22]
 * @author ringo
 *
 */
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayOfIntegers = {1,4,5,6};
		
		
	for(int integer :minMaxSum( arrayOfIntegers) )
	{
		System.out.println(integer);
	}
	}

	
	public static int[] minMaxSum(int[] arrayOfIntegers){
		
		if(arrayOfIntegers.length<4) return arrayOfIntegers;
		Arrays.sort(arrayOfIntegers);
		
		int min =0, max=0;
		for(int i =0; i<arrayOfIntegers.length; i++)
		{
			if(i<=3)
			{
				min+=arrayOfIntegers[i];
				
			
			}
			
			if(arrayOfIntegers.length-4<=i)
			{
				max+=arrayOfIntegers[i];
			}
		}
		
		
		
		return new int[]{max,min};
	}
}
