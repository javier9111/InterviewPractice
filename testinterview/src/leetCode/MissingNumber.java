package leetCode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	 public int missingNumber(int[] nums) {
	        
		 
		 //fist I know that the size of the array gives me the limit range
		 // the numbers can be not ordered 
		 // I can do brute force with 2 for loops and the best case will be On, and the worse will be On2
		 // or I can order the array and just loop one time
		 
		  Arrays.sort(nums);
		
		  
		 for(int i=0; i<nums.length; i++){
			 
			 if(nums[i]!= i){
				 return i;
			 }
			 
			 
		 }
		 
		 
		 return nums.length;
	    }
}
