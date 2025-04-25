package leetCodeInterviewPrep.Algoritmos.Done;


public class BinarySearch {



    public static void main(String[] args){

        int[] nums = {1,5,6,7,8,9,10};
        System.out.println( findByBinarySearch(nums, 10));
    }


    public static int findByBinarySearch(int[] nums, int find){

       
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid =  left+(right-left)/2;//this update is for max numbers like left= Integer.MAX_VALUE-1 and right=Integer.MAX_VALUE
            if(nums[mid] == find){
                return mid;
            }
            if(find>nums[mid]){
                left = mid+1;
               
            }else{
                right = mid-1;
            }
        }

        return -1;
    }
}
