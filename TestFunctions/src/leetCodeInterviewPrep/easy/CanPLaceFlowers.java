package leetCodeInterviewPrep.easy;
/***
 * 
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, 
 * flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not 
empty, and an integer n, return true if n new flowers can be planted in the flowerbed 
without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 */
public class CanPLaceFlowers {

    public static void main(String[] args){

            int[] flowerbed = {1,0,0,0,1};

            System.out.println(canPlaceFlowers(flowerbed ,2));

    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
    int length = flowerbed.length;

    for (int i = 0; i < length; i++) {
        if (flowerbed[i] == 0) {
            // Check left and right positions
            boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
            boolean emptyRight = (i == length - 1 || flowerbed[i + 1] == 0);

            if (emptyLeft && emptyRight) {
                flowerbed[i] = 1; // Plant a flower
                count++; 
                i++; // Skip next index to avoid adjacent planting

                if (count >= n) { // If we placed enough flowers, return true early
                    return true;
                }
            }
        }
    }
    
    return count >= n;
    }
}
