package leetCodeInterviewPrep.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 
 * 
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
-1000 <= nums1[i], nums2[i] <= 1000
 */
public class FindDifferenceArrays {


    public static void main(String[] args) {

        int[] nums1 = {1,2,3,3};
        int[] nums2 = {2,4,6,4};

        System.out.println(findDifference(nums1,nums2));

    }


     public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(); 

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);  
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);  
        }

        // printArr(set);
        // printArr(set2);
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        set.forEach((i) -> {if(!set2.contains(i)){num1.add(i);}});
        set2.forEach((i) -> {if(!set.contains(i)){num2.add(i);}});

        result.add(num1);
        result.add(num2);
        return result;
    }


    public static void printArr(Set<Integer> nums){

        System.out.print("[");
        nums.forEach((i) -> System.out.print(i+",") );
        System.out.print("]");
    }
}
