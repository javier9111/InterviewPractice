package leetCodeInterviewPrep.easy;
/***
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
public class ReverseVowels {

    public static void main(String[] args){

        String s = "leetcode";

        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

    String vowels = "AEIOUaeiou";
      int pointer1=0;
      int pointer2=s.length()-1;

      char[] charArray = s.toCharArray();
      while(pointer1<pointer2){
        if(vowels.indexOf(charArray[pointer1]) != -1 ){

            if(vowels.indexOf(charArray[pointer2]) != -1 ){
                char temp = charArray[pointer2];
                charArray[pointer2] = charArray[pointer1];
                charArray[pointer1] = temp;
                pointer1++;
                pointer2--;
            }else{
                pointer2--; 
            }
        }else{
        pointer1++;
        }
      }

      return new String(charArray);
    }
}
