package leetCodeInterviewPrep.medium;
/**
 * 
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 */
public class TripleSubsequence {

    public static void main(String[] args){

        int[] nums = {20,100,10,2,5,1};

        System.out.println(increasingTriplet(nums));

    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
/**
 * 
 *
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int small=Integer.MAX_VALUE, indexSmall=0, indexSecondSmall=1, secondSmallest=nums[1];
        
        int counter =2;
        while(counter<nums.length){

            if(nums[indexSmall]>nums[indexSecondSmall]){
                indexSmall = indexSecondSmall;
                indexSecondSmall++;
            }

        }
        return false;

    }
 */
}
