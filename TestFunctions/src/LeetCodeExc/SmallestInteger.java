package LeetCodeExc;

import java.lang.reflect.Array;
import java.util.Arrays;


/***
 * 
 * You are given a 0-indexed array of integers nums.

A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.

Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.

 

Example 1:

Input: nums = [1,2,3,2,5]
Output: 6
Explanation: The longest sequential prefix of nums is [1,2,3] with a sum of 6. 6 is not in the array, therefore 6 
is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.
Example 2:

Input: nums = [3,4,5,1,12,14,13]
Output: 15
Explanation: The longest sequential prefix of nums is [3,4,5] with a sum of 12. 12, 13, and 14 belong to the array 
while 15 does not. Therefore 15 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.
 
 * 
 * @author ringo
 *
 */
public class SmallestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr1 = {1,2,3,2,5};
		int[] arr2 = {3,4,5,1,12,14,13};
		
		int[] arr3 = {29,30,31,32,33,34,35,36,37};
		
		int [] arr4 = {1,2,3,9,2,10,8,3,10,2};
		
		int [] arr5 = {19,47,6,8,9,20};
		
		System.out.println(missingInteger(arr5));
		
	}

	
	
	
	
	
	 public static int missingInteger(int[] nums) {
	       
			 if(nums.length == 1) return nums[0]+1;
			 //iterate to check the longest secuence number
			 //save in a set list the sum of the secuence number
			 //compare the set list of the array
			 //take out the small one
			 
			 int sum =nums[0];
			 for(int i=1; i<nums.length; i++){
				 if(nums[i]!=nums[i-1]+1){
					break;
				 }else{
					 
					 sum=sum+nums[i];
				 }
			 }
			 
			 int result =sum;
			 boolean bandera = true;
			 Arrays.sort(nums);
			 while(bandera){
				 
				 
				 if(Arrays.binarySearch(nums, result)>=0){
				 result++; 
				 }else{
					 bandera =false;
				 }
			 }
			 return result;

	 }
}
