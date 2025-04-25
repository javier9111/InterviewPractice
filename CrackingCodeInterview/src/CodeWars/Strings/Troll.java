package CodeWars.Strings;

public class Troll {

	/**
	 * Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String sentence = "esto es una frase con muchas vocales LOL AHORA CON MAYUSCULAS";
		
		System.out.println(disemvowel(sentence));
				
	}

	 public static String disemvowel(String str) {
	        // Code away...
		 String strTemp=str;
		 String[] vaouls = {"a","e","i","o","u"};
		 
		 
		 
		 
		 for(int i=0; i<vaouls.length; i++)
		 {
			 
			 
			 strTemp = strTemp.replaceAll(vaouls[i], "");
			 strTemp = strTemp.replaceAll(vaouls[i].toUpperCase(), "");
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 return strTemp;
	    }
	
}
