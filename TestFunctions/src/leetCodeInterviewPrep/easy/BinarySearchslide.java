package leetCodeInterviewPrep.easy;



/**
 * 
 * 
 * We have a sorted array but is moved n times to the right, please make a binary search we it can find the value Key
 * 
 * Example
 * nums = [7,8,9,1,2,3,4,5]
 * find 3
 * result = 5
 * 
 * the array was moved 3 possitions to the right and
 * 
 * 
 * Example
 * nums = [1,2,3,4,5,6,7]
 * find =5
 * result = 4
 * 
 * the array was moved 0 possitions
 * 
 *
 * Example
 * nums = [10,1,2,3,4,5,6,7]
 * find =10
 * result = 0
 * 
 * the array was moved 1 possition
 */



public class BinarySearchslide {



    public static void main(String[] args){

        int[] nums = {7,8,9,10,2,3,4,5};
        int find = 7;
        System.out.println(searchRotated(nums, find));

    }

    public static int find(int[] nums, int find){

        // firs I need to check the particion where the array divides by two and

        int particion =-1;
        int left =0;
        int right =nums.length-1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                particion = i;
                break;
            }
        }

        if(particion !=-1){
            if(nums[particion] == find){
                return particion;
            }else if(nums[particion]<find && nums[nums.length-1]>= find){
                left =particion;
            }else if(nums[0]>=find && nums[particion-1]<=find){
                right =particion-1;
            }
        }

        while(right>=left){

            int mid = left+(right-left)/2;
            if(nums[mid]== find){
                return mid;
            }

            if(nums[mid]>find){
                right = mid-1;
                
            }else{
                left = mid+1;
            }
        }


        return -1;
    }


    public static int searchRotated(int[] nums, int key) {
        int left = 0, right = nums.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent overflow
    
            if (nums[mid] == key) return mid;
    
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (key >= nums[left] && key < nums[mid]) {
                    right = mid - 1; // Search left
                } else {
                    left = mid + 1; // Search right
                }
            } else { // Right half is sorted
                if (key > nums[mid] && key <= nums[right]) {
                    left = mid + 1; // Search right
                } else {
                    right = mid - 1; // Search left
                }
            }
        }
        return -1;
    }
}
