package CodeWars.Arrays;

import java.util.Stack;

public class BraceChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(isValid("())"));
	}

	
	 public static boolean isValid(String braces) {
		    // Add code here
		 if(braces.startsWith(")")||braces.startsWith("]")||braces.startsWith("}")) return false;
		 
		 Stack<Character> stackString = new Stack<Character>();
		 
		 for(char c: braces.toCharArray())
		 {
			 
			
			 	switch (c) {
				case '(':
				{
					stackString.push(')');

					break;
				}
				case '[':
				{
					stackString.push(']');
					
					break;
				}
				case '{':
				{
					stackString.push('}');
					break;
				}
				
				case ']':
				case ')':
				case '}':
				{
					
					if(stackString.isEmpty()||c!=stackString.peek() )
					{
						return false;
					}else
					{
						stackString.pop();
					}
					break;
				}
				default:
					break;
				}

			 
		 }
		 
		 return stackString.isEmpty();
		  }
}
