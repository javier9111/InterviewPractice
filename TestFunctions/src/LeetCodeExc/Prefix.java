package LeetCodeExc;

public class Prefix {

	public static void main(String[] args ){
		
		
		String[] strs = {"flower","flow","flight"};
		
		String[] strs3 = {"dog","racecar","car"};
		
		String[] str2= {"cir","car"};
		
		String commonPref = longestCommonPrefix(strs);
		
		System.out.println("this is the commmon prefix " +commonPref);
	}
	    public static String longestCommonPrefix(String[] strs) {
	        
	        
	        if(strs.length == 1)
	        {
	        	return strs[0];
	        }
	        int strLength = 0;
	        int prevstrLength = strs[0].length();

	        for(int i=1; i<strs.length; i++)
	        {
	            strLength = strs[i].length();
	            if(prevstrLength > strLength)
	            {
	                prevstrLength = strLength;
	            }
	        }
	        int j = 0;
	        String commpreFix ="";
	        String prevStr=strs[0];
	        Boolean notPrefix = true;
	        for(int i=1; j<prevstrLength; i++)
	        {

	            if(strs[i].charAt(j) == prevStr.charAt(j) )
		            {
		             
		            	
		            	 prevStr = strs[i];
		                if(i == strs.length-1 && notPrefix )
		                {
		                	commpreFix += strs[i].charAt(j);
		                   
		                    }
		            }
		            else
		            {
		               notPrefix = false;
		               prevStr = strs[i];
		                   
		            }
	            if(i == strs.length-1 )
                {
                    j++;
                    i=0;
                    prevStr=strs[0];
                }
	            }
	            
	        
			return commpreFix;
	            
	    }
	}

