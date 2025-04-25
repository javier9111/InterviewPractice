package leetCodeInterviewPrep.easy;

import java.util.Arrays;

/***
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
 */



public class MayorityElement {





    public static void main(String[] args) {
        

        int[] nums = {3,2,3};
        int[] nums2 = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums2));


    }


    public static int majorityElement(int[] nums) {

       int k = nums.length /2;

       int rep =1;

       for(int i=0; i<nums.length; i++) {

            for(int j=0; j<nums.length; j++) {

                if(i!=j){

                    if(nums[i] == nums[j]){
                        rep++;
                    }
                }
            }
            if(rep> k){
                return nums[i];
            }
            rep=1;

       }
   
        return 0;
    }

}
