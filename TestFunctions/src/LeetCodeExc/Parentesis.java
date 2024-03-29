package LeetCodeExc;

import java.nio.charset.Charset;
import java.util.Stack;

/***
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *                                                                                                                         
 * An input string is valid if:                                                                                           
 *                                                                                                                         
 * Open brackets must be closed by the same type of brackets.                                                             
 * Open brackets must be closed in the correct order.                                                                     
 */
public class Parentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()[]{}";
		String s2 = "([)]";
		String s3 = "([])]";
		String s4 = "(((([[[[])]";
		String s5 = "(((([[[[])))]";
		String s6= "((([][])[][]))";
		String s7= "()[][[[]]((([][[]])[][]))";
		String s8= "()[][[(()){(())[]}]]((([][[]])[][]))";
		String s9=  "(){}}{";
		System.out.println(isValid(s9));
	}
	
	
	public static boolean isValid(String s) {
        
		
		Stack<Character > pStack = new Stack<Character >();
		
		
		for(int i=0; i< s.length(); i++)
		{
			if(i==0 && (s.charAt(i)==']'||s.charAt(i)==')'||s.charAt(i)=='}'))
			{
				return false;
			}
			if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{')
			{
				pStack.push(s.charAt(i));
				
			}
			else{
				
				switch(s.charAt(i)){
				
					case ']': {
						if(pStack.empty() || pStack.peek() == '(' ||pStack.peek() =='{' )
						{
							return false;
						}
						else{
							pStack.pop();
						}
						break;
					} 
					case '}': {
						if(pStack.empty() || pStack.peek() == '[' ||pStack.peek() =='(' )
						{
							return false;
						}
						else{
							pStack.pop();
						}
						
						break;
					} 
					case ')': {
						if( pStack.empty() || pStack.peek() == '[' ||pStack.peek() =='{' )
						{
							return false;
						}
						else{
							pStack.pop();
						}
						break;
					} 
				} 
			}
			System.out.println(pStack);
		}
		if(!pStack.empty() && (pStack.peek() == '(' ||pStack.peek() =='{'||pStack.peek() == '['))
		{
			return false;
		}
		return true;
    }

}
