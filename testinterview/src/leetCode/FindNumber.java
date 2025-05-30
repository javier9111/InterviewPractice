package leetCode;



/**
 * 
 * Giving a sorted array but sorted on n rotations provide a solution that can
 * find a  value in the array 
 * 
 * 
 * example
 * 
 *  [7,8,9,10,2,3,4] key = 4;
 *  
 *  [7,8,9] [10,2,3,4]
 * 
 * Try to find the solution in logN time
 */
public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	private int positionFound(int[] nums, int target){
		
		int l = 0;
	    int r = nums.length - 1;

	    while (l <= r) {
	      final int m = (l + r) / 2;
	      if (nums[m] == target)
	        return m;
	      if (nums[l] <= nums[m]) { // nums[l..m] are sorted.
	        if (nums[l] <= target && target < nums[m])
	          r = m - 1;
	        else
	          l = m + 1;
	      } else { // nums[m..n - 1] are sorted.
	        if (nums[m] < target && target <= nums[r])
	          l = m + 1;
	        else
	          r = m - 1;
	      }
	    }

	    return -1;
		
	}

}
