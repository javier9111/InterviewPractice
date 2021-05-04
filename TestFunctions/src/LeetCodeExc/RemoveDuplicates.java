package LeetCodeExc;
/***
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 *		
 *		Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *		
 *		Clarification:
 *		
 *		Confused why the returned value is an integer but your answer is an array?
 *		
 *		Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 *		
 *		Internally you can think of this:
 *		
 *		// nums is passed in by reference. (i.e., without making a copy)
 *		int len = removeDuplicates(nums);
 *		
 *		// any modification to nums in your function would be known by the caller.
 *		// using the length returned by your function, it prints the first len elements.
 *		for (int i = 0; i < len; i++) {
 *		    print(nums[i]);
 *		}
 * @author ringo
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int[] nums2= {1,1,2};
		
		System.out.println( "this is the length: "+removeDuplicates(nums2));


		for(int i=0; i<nums2.length; i++)
		{
			System.out.print(nums2[i]+",");
		}
		
	}
	
	
	
	
	
	 public static int removeDuplicates(int[] nums) {
	        
		 if(nums.length == 1)
		 {
			 return 1;
		 }
		 int pos=0, recpos=0, len=1;
		 
		 for(int i=1; i<nums.length; i++)
		 {
			 
			 if(nums[pos] == nums[i])
			 {
				 
				recpos ++;
				
			 }
			 else{
				
				 nums[i-recpos] = nums[i];
				pos = i;
				len++;
			 }
		 }
		 
		 return len;
	    }
}
