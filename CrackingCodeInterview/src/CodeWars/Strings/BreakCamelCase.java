package CodeWars.Strings;

/***
 * Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 * @author ringo
 *
 */
public class BreakCamelCase {

	
	
	public static void main(String[] args)
	{
		System.out.println(camelCase("thisisaalllowrcase"));
	}
	
	
	 public static String camelCase(String input) {
		 
		 if(input.length()<=1) return input;
		 
		 
		 char[] charArr = input.toCharArray();
		 
		StringBuilder result = new StringBuilder(); 
		 
		 
		for(int i=0; i<charArr.length; i++)
		{
		
				if(charArr[i]>= Character.valueOf('A') && charArr[i]<=Character.valueOf('Z'))
				{
					result.append(" ");
					result.append(charArr[i]);
				}
				else
				{
					result.append(charArr[i]);
				}
			
		}
		 
		    return result.toString();
		  }
}
