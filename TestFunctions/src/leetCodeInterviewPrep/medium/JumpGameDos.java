package leetCodeInterviewPrep.medium;


/***
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 */
public class JumpGameDos {


    public static void main(String[] args){

        int[] nums= {2,3,1,1,4};

        System.out.println(jump(nums));

    }

    public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0; // No jumps needed if already at the last index
        }
    
        int jumps = 0; // Total number of jumps
        int currentEnd = 0; // Current boundary of the farthest reachable index
        int farthest = 0; // Farthest index that can be reached
    
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);
    
            // If we reach the current boundary, make a jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest; // Update the boundary to the farthest reachable index
            }
        }
    
        return jumps;
    }
}
