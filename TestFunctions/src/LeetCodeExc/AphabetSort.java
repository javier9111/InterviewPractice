package LeetCodeExc;


/***
 * Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters
 * in alphabetical order (ie. hello becomes ehllo). 
 * Assume numbers and punctuation symbols will not be included in the string. 
 * @author RoblesJ
 *
 */
public class AphabetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a");
		String order= AlphabetSort("esto");
		System.out.println(order);
	}
	
	
	public static String AlphabetSort(String str)
	{
		
		char[] charArr = str.toCharArray();
		
		quickSort(charArr,0,charArr.length-1);
		
		//you can do Array.sort() as well.
		
		
		return String.copyValueOf(charArr);
	}
	
	
	public static void quickSort(char arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);
	 
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}

	private static int partition(char arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);
	 
	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	 
	            char swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	 
	    char swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;
	 
	    return i+1;
	}
}
