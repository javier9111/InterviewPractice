package CodeWars.Strings;

public class VowelsCount {
/***
 * Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getCount("esto es una prueba DE CUANTOS VOCALES"));
	}

	
	  public static int getCount(String str) {
		    int vowelsCount = 0;
		    
		    char[] charArr= str.toCharArray();
		    
		    
		    for(int i=0; i<charArr.length; i++)
		    {
		    	if(charArr[i] == Character.valueOf('a')|| charArr[i] == Character.valueOf('e')||charArr[i] == Character.valueOf('i')||charArr[i] == Character.valueOf('o')||charArr[i] == Character.valueOf('u')||
		    			charArr[i] == Character.valueOf('A')|| charArr[i] == Character.valueOf('E')||charArr[i] == Character.valueOf('I')||charArr[i] == Character.valueOf('O')||charArr[i] == Character.valueOf('U')	
		    			)
		    	{
		    		vowelsCount++;
		    	}
		    }
		    // your code here
		    return vowelsCount;
		  }
}
