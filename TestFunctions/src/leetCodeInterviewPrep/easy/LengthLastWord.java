package leetCodeInterviewPrep.easy;

public class LengthLastWord {

    public static void main(String[] args){

        String word= "luffy is the king of the pirates";

        System.out.println(lengthOfLastWord(word));

    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }


}
