package leetCodeInterviewPrep.medium;
/*
 * 
 * 
 * Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */
public class LongestSubarray {


    public static void main (String[] args){

        int[] nums = {0,1,1,1,0,1,1,0,1};

        System.out.println(longestSubarray(nums));
    }


    public static int longestSubarray(int[] nums) {
        
        int maxLength =0;

        int zeroCount =0;
        int left=0;

        for(int end=0; end<nums.length; end++){

            if(nums[end]==0){
                zeroCount++;
            }

            if(zeroCount>1){
                while(zeroCount>1){
                    if(nums[left]==0){
                        zeroCount--;
                    }
                    left++;
                }
            }
            maxLength = Math.max(maxLength, end - left );
        }




        return maxLength;
    }


}
