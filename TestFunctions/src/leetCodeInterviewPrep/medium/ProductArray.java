package leetCodeInterviewPrep.medium;


/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 */
public class ProductArray {


    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4};

       int[] resut = productExceptSelf(nums);        
        for (int i = 0; i < nums.length; i++){
            System.out.println(resut[i]);
        }
        

    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
    
        // Step 1: Compute prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
    
        // Step 2: Compute suffix products and multiply with prefix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
    
        return result;
    }


    // public static int[] productExceptSelf(int[] nums) {
    //    int[] result = new int[nums.length];
    //     for(int i=0; i<nums.length; i++){
    //         makeproduct(1, result, nums, i, 0, nums.length);
    //     }
    //     return  result;
    // }

    // public static void makeproduct(int initialValue, int[] result, int[] nums,int numIndex, int multiplyIndex, int length){
    //     if(multiplyIndex<nums.length){
    //         if( numIndex != multiplyIndex ){
    //             initialValue = initialValue*nums[multiplyIndex];
    //         }
    //             makeproduct(initialValue, result,nums,numIndex,++multiplyIndex, length); 
    //     }else{
    //         result[numIndex] = initialValue;
    //     }

    // }
}
