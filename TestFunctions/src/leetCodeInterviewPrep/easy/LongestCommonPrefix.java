package leetCodeInterviewPrep.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        // String[] words = {"flower", "flow", "flight"};
        // System.out.println(longestCommonPrefix(words)); // Output: "fl"
        
        // String[] words2 = {"dog", "racecar", "car"};
        // System.out.println(longestCommonPrefix(words2)); // Output: ""

        String[] words3 = {"ab", "a"};
        System.out.println(longestCommonPrefix(words3)); // Output: "a"
    }


    public static String longestCommonPrefix(String[] strs) {
        String prefix="";
        String mainString = strs[0];
       for(int i=0; i< mainString.length(); i++){

        for(int j=1; j< strs.length; j++){
                if(i>= strs[j].length() || strs[j].charAt(i)!= mainString.charAt(i)  ){
                    return prefix;
                }
            }
            prefix+=mainString.charAt(i);
       }
       return prefix;
    }
}
