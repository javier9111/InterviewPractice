package LeetCodeExc;

/***
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * 
 *
 *Example 1:
 *
 *Input: nums = [1,3,5,6], target = 5
 *Output: 2
 *Example 2:
 *
 *Input: nums = [1,3,5,6], target = 2
 *Output: 1
 *Example 3:
 *
 *Input: nums = [1,3,5,6], target = 7
 *Output: 4
 *Example 4:
 *
 *Input: nums = [1,3,5,6], target = 0
 *Output: 0
 *Example 5:
 *
 *Input: nums = [1], target = 0
 *Output: 0
 * @author ringo
 *
 */
public class serachInsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int searchInsert(int[] nums, int target) {
		
		if(nums[nums.length-1]<target)
		{
			return nums.length;
		}
		if(nums[0]>target)
		{
			return 0;
		}
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]>= target)
			{
				return i;
			}
			
		}
        return 0;
    }

}
