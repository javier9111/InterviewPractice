package leetCodeInterviewPrep.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 
 * Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

 

Example 1:

Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
Example 2:

Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
Example 3:

Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"
 

Constraints:

1 <= word1.length, word2.length <= 105
word1 and word2 contain only lowercase English letters.
 */
public class DetermineTwoString {



    public static void main(String[] args) {
        
        String word1 = "uuaa";
        String word2 = "ssxx";
        System.out.println(closeStrings2(word1,word2));
    }


    public static boolean closeStrings2(String word1, String word2){

        if(word1.length() != word2.length()){
            return false;
        }

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();


        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

      if (!freq1.keySet().equals(freq2.keySet())) return false;

        int[] values1 = freq1.values().stream().mapToInt(Integer::intValue).toArray();

        int[] values2 = freq2.values().stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(values1);
        Arrays.sort(values2);
        for (int i = 0; i < values1.length; i++) {
            if (values1[i] != values2[i]) {
                return false;
            }
        }
        
        return true;

    }

    public static boolean closeStrings(String word1, String word2) {
        
        // check first if the length of the two strings are equal
        // if not return false
        // check if the two strings have the same characters
        // if they have the same characters, check that only 2 characters are different
        // if they have different characters check if the frecuency matches other frecuency of another character
        // if they match, check if the other characters are the same
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); ++i) {
            freq1[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); ++i) {
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if ((freq1[i] > 0 && freq2[i] == 0) || (freq2[i] > 0 && freq1[i] == 0)) {
                return false; 
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; ++i) {
            if (freq1[i] != freq2[i]) {
                return false; 
            }
        }
        return true;
    }
}
