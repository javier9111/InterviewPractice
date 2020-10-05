/**
 * 
 */
package LeetCodeExc;



/**
 * @author RoblesJ
*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
*Each character in S is a type of stone you have.  
*You want to know how many of the stones you have are also jewels.
*The letters in J are guaranteed distinct, and all characters in J and S are letters.
*Letters are case sensitive, so "a" is considered a different type of stone from "A"
* 
* 
* 


 */
public class Jewels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int output = 0;
		String jewels = "zaBCH";
		String stones = "Z";
		
		
		
		output = numJewelsInStones(jewels,stones);
		
		System.out.println("jewels = "+jewels + " Stones = "+stones+" output = "+output);

	}

    public static int numJewelsInStones(String J, String S) {
        
    	char[] Slist =S.toCharArray();
    	char[] JList =J.toCharArray();
    	int count = 0;
    	for(char stone : Slist)
    	{
    	    for( char jewel : JList )
    		{
    	    	if(stone == jewel)
    	    	{
    	    		count++;
    	    	}
    		}
    	}
    	
    	
    	return count;
        
    }
}
