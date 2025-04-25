package LeetCodeExc;



/***
 * 
 * 
 * 
 * given a ordered array find the number key in a solution with logN time
 * @author ringo
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 ={1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		
		int key =30;
		
		
		int result = binarySearchNumber(arr1, key);
		System.out.println(result);
		
	}

	
	
	
	
	public static int binarySearchNumber(int[] arr, int key){
		
		
		
		int left=0, right=arr.length-1;
		int result = -1;
		while(left<= right){
			
			int mid = left+(right-left)/2;
			
			if(arr[mid] == key){ return mid;}
			
			if(arr[mid]>key){
				right= mid-1;
				
			}else{
				
				left= mid+1;
			}
		}
		
		
		
		
		
		return result;
	}
}
