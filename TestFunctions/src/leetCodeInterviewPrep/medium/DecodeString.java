package leetCodeInterviewPrep.medium;

import java.util.Stack;

/***
 * 
 * Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
 * 
 */
public class DecodeString {




    public static void main(String[] args){

        String s = "3[a]2[bc]";
        String s2="3[a2[c]]";


        System.out.println(decodeString(s2));
    }



    public static String decodeString(String s){

        String numbers  ="1234567890";
        String letters ="abcdefghijklmnopqrstuvwxyz";

        String result ="";
        StringBuilder number= new StringBuilder();
        StringBuilder letter= new StringBuilder();
        Stack<String> stack = new Stack<String>();
        Stack<Integer> stackNumbers = new Stack<>();
        Stack<String> stackLetters = new Stack<>();
        for(char c : s.toCharArray()){
            
            if(numbers.indexOf(c)>=0){
                number.append(c);
            }else if(letters.indexOf(c)>=0){
                letter.append(c);
            }
            else if(c=='['){
                stack.add("[");
                stackNumbers.add(Integer.parseInt(number.toString()));
                if(!letter.toString().isEmpty()){
                    stackLetters.add(letter.toString());
                }
                letter = new StringBuilder();
                number = new StringBuilder();
            }else if (c==']'){
                if(!letter.toString().isEmpty()){
                    stackLetters.add(letter.toString());
                }
                stack.pop();
                for(int i=0; i<stackNumbers.peek(); i++){
                    result+=stackLetters.peek();
                }
                stackNumbers.pop();
                stackLetters.pop();
                letter = new StringBuilder();
                number = new StringBuilder();
            }
        }


        result+=letter.toString();


        return result;

    }
}
