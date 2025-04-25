package easy;
/**
 * Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */
public class HighScoreWord {


    public static final void main(String[] args){

        String word = "man i need a taxi up to ubud";
        System.out.println(high(word));
    }


    public static String high(String s) {
        
        String[] words = s.split("\\s+");
        int max= 0;
        int highscore=0;
        for(int i=0; i<words.length; i++){
            int tempMax=0;
            for(char character : words[i].toCharArray()){
                tempMax+=character-96;
            }
            if(tempMax>max){
                max=tempMax;
                highscore=i;
            }
        }
        

        return words[highscore];
      }

}
