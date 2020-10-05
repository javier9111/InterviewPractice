package LeetCodeExc;


/***
 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
 * @author RoblesJ
 *
 */
public class letterChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = challenge ( "burlashz!");
		System.out.println(word);
	}
	
	public static String challenge(String word)
	{

		String wordParsed = "";
		for( char letter : word.toCharArray() )
		{
			char letterchanged = letter;
			if(letter > 96 && letter <122)
			{
			 letterchanged = (char) (letter+1);
			 if( letterchanged ==97 || letterchanged ==101 ||letterchanged ==105 ||letterchanged ==111 ||letterchanged ==117)
			 {
				 letterchanged = (char) (letterchanged -32);
			 }
			}
			else if (letter == 122)
			{
				letterchanged = 65;
			}
			wordParsed +=letterchanged;
		}
		
		return wordParsed;
	}

}
