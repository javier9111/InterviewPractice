package leetCodeInterviewPrep.medium;
/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
 * 
 * 
 */
public class MaxNumVowels {



    public static void main(String[] args){

        String s =  "abciiidef";
        String s2 = "aeiou";
        String s3 = "leetcode";

        System.out.println(maxVowels(s3, 3));
    }


    public static int maxVowels(String s, int k) {
        String sVowels = "aeiou";
        int max=0;

        StringBuilder sbs = new StringBuilder("");
        int vowels=0;
        for(int i=0; i<s.length(); i++){
            sbs.append(s.charAt(i));
            if(sVowels.contains(s.charAt(i)+"")){
                vowels++;
            }
            if(i >= k-1){
                max = Math.max(max, vowels);
                if(sVowels.contains(sbs.toString().charAt(0)+"")){
                    vowels--;
                }
                sbs.delete(0, 1);
            }
        }
        return max;
    }
}
