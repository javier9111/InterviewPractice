package leetCodeInterviewPrep.easy;
/***
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {


    public static void main(String[] args){

        int [] nums = {0,1,0,0,0,0,3,12};
        moveZeroesOn(nums);

        for(int i=0; i<nums.length; i++){

            System.out.print(nums[i]+ " ");
        }
    }


    /*brute force */
    public static void moveZeroes(int[] nums) {
    
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                for(int j=i; j>0; j--){
                    if(nums[j-1]!=0){
                        break;
                    }
                    nums[j-1]=nums[j];
                    nums[j]=0;
                }
            }
        }

    }
    public static void moveZeroesOn(int[] nums) {

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp; 
                left++;
            }
        }        
    }

}
