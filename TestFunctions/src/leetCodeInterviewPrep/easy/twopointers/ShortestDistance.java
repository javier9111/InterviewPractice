package leetCodeInterviewPrep.easy.twopointers;
/*
 * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

 

Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
Example 2:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
 

Constraints:

1 <= s.length <= 104
s[i] and c are lowercase English letters.
It is guaranteed that c occurs at least once in s.
 */
public class ShortestDistance {

    public static void main(String[] args){

        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s, c);

        for(int num : result){
            System.out.println(num);
        }
       
    }


    public static int[] shortestToChar(String s, char c) {
        

        /**
         * first I need to iterate through an string an make it a count till I find char c
         * I need two counters 1 that starts at cero where I iterate through the string until I find the c, then I other one to stay until I 
         * set the value in the array so I will increment
         * if my counter where it found c is located match my counter for string then I will move my c counter again.
         */

         int counterS=0, counterC=0;
        int[] answer = new int[s.length()];
        int minDistance =s.length();
         while(counterS<s.length()){
                while(counterC<s.length()){
                    if(s.charAt(counterC)==c){
                        int temDistance = Math.abs(counterS-counterC);
                        if(temDistance<minDistance){
                            answer[counterS] = temDistance;
                            minDistance = temDistance;
                        }
                    }
                    counterC++;
                }
                counterS++;
                counterC =counterS;
         }

         return answer;
    }
}
