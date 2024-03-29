package Zeros;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class zeroToTheRight {

	
	
	public static void main(String[] args)
	{

		int[] Input = {1,0,2,3,0,4,5,0};
		zeroToTheRight.duplicateZeros(Input);
		
		IntStream stream = Arrays.stream(Input);
		
		stream.forEach(System.out::println);
		

		
	}
	
	 /* Solution */   
    public static void duplicateZeros(int[] arr) {
            
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<arr.length; i++){ 
            queue.add(arr[i]);
        }
         
        int temp;
        for(int i=0; i<arr.length; i++){            
            temp = queue.poll();
            if(temp == 0){
                arr[i] = temp;
                if(i+1<arr.length){
                    arr[i+1] = temp;
                    i++;
                }
            }else {
                arr[i] = temp;
            } 
        }
    }

}
