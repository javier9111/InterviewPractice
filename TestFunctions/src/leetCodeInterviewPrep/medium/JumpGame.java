package leetCodeInterviewPrep.medium;
/**
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame {
    

    public static void main(String[] args){

        int[] nums ={2,5,0,0};

        System.out.println(canJump(nums));

    }



    public static boolean canJump(int[] nums) {
       // The farthest index we can currently reach
    int farthest = 0;

    for (int i = 0; i < nums.length; i++) {
        // If the current index is beyond the farthest reachable point, return false
        if (i > farthest) {
            return false;
        }

        // Update the farthest index we can reach from here
        farthest = Math.max(farthest, i + nums[i]);

        // If the farthest index is beyond or at the last index, return true
        if (farthest >= nums.length - 1) {
            return true;
        }
    }

    return false; // If we exit the loop, we can't reach the last index
    }
}
