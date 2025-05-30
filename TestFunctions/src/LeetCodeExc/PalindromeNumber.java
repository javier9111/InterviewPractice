package LeetCodeExc;
/***
 * Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 * @author ringo
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 12321;
		
		System.out.println(isPalindrome(x));
		
	}

	
	
	public static boolean isPalindrome(int x) {
	        
		if(x<0) return false;
		
		
		int tempx = x;
		int reverse =0;
		while(tempx>0){
			
			reverse *=10;
			reverse=reverse+tempx%10;
			tempx=tempx/10;	
		}
			
		return reverse == x;
	    }
	
}
