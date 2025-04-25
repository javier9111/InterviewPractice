package LeetCodeExc.medium;



public class ContainerMostWater {

	
	/***
	 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn 
	 * such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, 
	 * such that the container contains the most water.
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		
		int[] arr = {1,8,6,2,5,4,8,3,7};
		
		int maxarea = maxAreaoptimal(arr);
		
		System.out.println("this is the maxarea: "+maxarea);
	}
	
	
	
	/**
	 * This method will return the max area cover by the given array brute force
	 * @param height
	 * @return
	 */
public static int maxArea(int[] height) {
        
	int maxarea =0, tempmaxArea =0;
	
		//we can sum this method by saying that 
	 for(int i=0; i<height.length; i++)
	 {
		 for(int j=i+1; j<height.length; j++)
		 {
			 System.out.println(" valor de i : "+height[i]+ " valor de j: "+ height[j] +"  valor de contador j:"+j);
			 if(height[i]>= height[j])
			 {
				 tempmaxArea = height[j]*(j-i);
				 System.out.println("valor del temp area i"+ height[i] + " j:"+height[j]+" temparea:"+tempmaxArea);
				 
				 if(tempmaxArea> maxarea)
				 {
					 maxarea = tempmaxArea;
				 }
				 
			 }else if(height[i]<= height[j]){
				 tempmaxArea = height[i]*(j-i);
				 
				 System.out.println("valor del temp area i"+ height[i] + " j:"+height[j]+" temparea:"+tempmaxArea);
				 if(tempmaxArea> maxarea)
				 {
					 maxarea = tempmaxArea;
				 }
			 }
		 }
	 }
	return maxarea;
    }
/***
 * This is the solution with o(n) time complexity
 * @param height
 * @return
 */
public static int maxAreaoptimal(int[] height) {
    
	int pointerLeft = 0, pointerRight = height.length-1, maxarea=0;
	
	
	while(pointerLeft<pointerRight)
	{
		
		maxarea = Math.max(maxarea, Math.min(height[pointerLeft], height[pointerRight])*(pointerRight-pointerLeft));
		
		if(pointerLeft< pointerRight)
		{
			pointerLeft++;
		}
		else
		{
			pointerRight--;
		}
	}
	 
	 
	 
	return maxarea;
    }
}
