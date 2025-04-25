package leetCodeInterviewPrep.easy;

public class ReverseWordsSimplify {


    public static void main(String[] args) {
        String s = "     This      is a good day";

        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {

        String  result ="";
        String[] words = s.trim().split("\\s+");


        for(int i= words.length-1; i>=0; i--){
            result +=words[i]+" ";
        }

        return result.trim();
    }
}
