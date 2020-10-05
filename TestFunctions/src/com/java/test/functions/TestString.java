package com.java.test.functions;

import java.util.ArrayList;
import java.util.List;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Test 1
		String test1 = "123_456";
		String test2 = "1234566_7";
		String test3 = "1234566_789101112";
		String test4 = "1234566789_1011121213_123123123_123123";
		String test5 = "There is an inc/redibly long supercalifragilisticealksj/dlkajsdkjaslkdjalksjdlasjldjalsjdlajs jsalkd asldj alkds jalkds lkajs dlas/kdlal dj lksajd lkajsdlkajsl. dkja slkdj alksj daskjd lsak,jdlksajdlksajdlksaj dlksajdlkasj dlksajdlk ajlksdj alsjd askjdlaksjdlksajldkjaslkdjlaksjdk adkasjd lkajds lsajd laksj dlaskjd lkasj lkasj ldjas lkjas ldk salkjd laksj dlaskj dlsakjd lsakj lasjd laskj laksjd laksjd, laksj dlsakjd lksajd alskj dlaskjd laskj dlaksdj lsakjd laksjd laksjd laksjd laskjd laksjd laksj dlaksjd lksajd laksjd lksajd lkasjlkd jsalkdj lksajd laksjd laksjd laskjd laksjd laskjd lakjsd lkasjd lkajsdlk aslkdj salkjd laksjd lasjd lask dxpialidocious word in here. Oh my gooodness, this string just keeps on going forever and ever. I am so confused/conflicted/enebriated from the performance verification results of this fantastic and maniacal string wrapper. Boom-chicka-bow-wow!";
		String test6 = "Gabe's; test report that is really cool";
		List <String> listResults = new ArrayList<String>();
		/*listResults.add(wrapWordOnChar (test1,7,"_"));
		listResults.add(wrapWordOnChar (test2,7,"_"));
		listResults.add(wrapWordOnChar (test3,7,"_"));
		listResults.add(wrapWordOnChar (test4,7,"_"));*/
		listResults.add(wrap (test6,16,"\n",true,"; "));
		//listResults.add(wrapWordOnChar ( test5,16," " ) );
		
		int count =1;
		for( String item : listResults)
		{
			
			System.out.println("This is the result for item "+count+": "+item);
			count++;
		}
	}

	
	
	
	public static String wrpWordOnCharForAll(String stringToWrap, int maxChar, String regex)
	{
	
		 int size = stringToWrap.length() ;
	   	 String breakTag = "<br>" ;
	   	 List<String> wordsList = new ArrayList<String>();
	   	 List<Character> charList = new ArrayList<Character>();
	   	 char charToCheck;
	   	 String word = "";
	   	 String phrase ="";
	   	 String result ="";
	   	 for(char character : regex.toCharArray())
	   	 {
	   		charList.add(character);
	   	 }
	   	 for( int i = 0; i < stringToWrap.length(); i++)
	   	 {
	   		charToCheck = stringToWrap.charAt(i);
	   		 word += charToCheck;
	   		 if( charList.contains( charToCheck ) ||  (i == stringToWrap.length()-1) )
	   		 {
	   			 wordsList.add(word);
	   			 word = "";
	   		 }
	   		 
	   	 }
   	 
	   	 for(String theWord : wordsList)
	   	 {
	   		 if( theWord.length() > maxChar )
	   		 {
	   			 result+= theWord.substring( 0, maxChar )+breakTag;
	   			 
	   			 phrase = theWord.substring( maxChar );
	   		 }
	   		 else if( phrase.length() + theWord.length() > maxChar)
	   		 {
	   			 result = result + phrase + breakTag;
	   		 	 phrase = theWord;
	   		 }
	   		 else 
	   		 {
	   			 phrase += theWord;
	   		 }
	   		 
	   		 
	   	 }
	   	 
	   	 return result;
	}
	
	
	  public static String wrapWordOnChar(String stringToWrap, int maxChar, String regex ) {
	    	 
	    	 int size = stringToWrap.length() ;
	    	 String breakTag = "<br>" ;
	    	 String restOfTheString ="";
	    	 List<Character> charsList = new ArrayList<Character>();
	    	 boolean hasDelimeters = false;
	    	 int charDeliIndex = -1;
	    	 for(char character : regex.toCharArray())
	    	 {
	    		 charsList.add(character);
	    	 }
	    	 if( size > maxChar ) 
	    	 {	
	    		 restOfTheString = stringToWrap.substring( maxChar );
	    		 stringToWrap = stringToWrap.substring( 0, maxChar );
	    		 for( int i = 0; i < maxChar; i++ )
	 			{
	 					 						
	 				if ( charsList.contains( (Character) stringToWrap.charAt( i ) )  )
	 				{
	 					//stringToWrap = stringToWrap.substring(  0, i + 1  ) + breakTag  + stringToWrap.substring ( i + 1 ) ;	
	 					//i += maxChar + breakTag.length() ;
                        
                        //size = stringToWrap.length();

	 					hasDelimeters = true;
	 					charDeliIndex = i;
	 				}
	 			}
	    		 if( charDeliIndex >=0)
	    		 {
	    			 restOfTheString = stringToWrap.substring( charDeliIndex )+restOfTheString;
	    			 stringToWrap = stringToWrap.substring(0,charDeliIndex)+breakTag;
	    		 }
	    		 else
	    		 {
	    			 restOfTheString = stringToWrap.substring( maxChar )+restOfTheString;
	    			 stringToWrap = stringToWrap.substring( 0, maxChar );
	    		 }
	    		 stringToWrap += wrapWordOnCharChild( restOfTheString, maxChar, regex );
	    	 }
	    	 return stringToWrap ;
	     }
	  
	  public static String wrapWordOnCharChild(String stringToWrap, int maxChar, String regex )
	  {
		  int size = stringToWrap.length() ;
	    	 String breakTag = "<br>" ;
	    	 String restOfTheString ="";
	    	 
	    	 boolean hasDelimeters = false;
	    	 int stringLegthAfterBreak = 0;
	    	 int charDeliIndex = -1;
	    	 List<Character> charsList = new ArrayList<Character>();
	    	 for(char character : regex.toCharArray())
	    	 {
	    		 charsList.add(character);
	    	 }
	    	 if( size > maxChar ) 
	    	 {	
	    		 restOfTheString = stringToWrap.substring( maxChar );
	    		 stringToWrap = stringToWrap.substring( 0, maxChar );
	    		 for( int i = 0; i < maxChar; i++ )
	 			{
	 					 						
	    			 if ( charsList.contains( (Character) stringToWrap.charAt( i ) )  )
		 				{
		 					//stringToWrap = stringToWrap.substring(  0, i + 1  ) + breakTag  + stringToWrap.substring ( i + 1 ) ;	
		 					//i += maxChar + breakTag.length() ;
	                        
	                        //size = stringToWrap.length();

		 					hasDelimeters = true;
		 					charDeliIndex = i;
		 				}
		 			}
		    		 if( charDeliIndex >=0)
		    		 {
		    			 restOfTheString = stringToWrap.substring( charDeliIndex )+restOfTheString;
		    			 stringToWrap = stringToWrap.substring(0,charDeliIndex)+breakTag;
		    		 }
		    		 else
		    		 {
		    			 restOfTheString = stringToWrap.substring( maxChar )+restOfTheString;
		    			 stringToWrap = stringToWrap.substring( 0, maxChar );
		    		 }
	    		 stringToWrap += wrapWordOnCharChild( restOfTheString, maxChar, regex );
	    	 }

	    	 return stringToWrap ;
	  }
	  
	  
	  public static String wrap(String str, int wrapLength, String newLineStr, boolean wrapLongWords, String delimiters) {
			if (str == null) {
				return null;
			}
			if (newLineStr == null) {
				newLineStr = "\n";
			}
			if (wrapLength < 1) {
				wrapLength = 1;
			}
			if( delimiters == null )
			{
				delimiters = " ";
			}
			List<Character> delimiterList = new ArrayList<Character>();
	    	 for(char character : delimiters.toCharArray())
	    	 {
	    		 delimiterList.add(character);
	    	 }
			int inputLineLength = str.length();
			int offset = 0;
			StringBuilder wrappedLine = new StringBuilder(inputLineLength);
			
			while (inputLineLength - offset > wrapLength) {
				if ( delimiterList.contains( str.charAt(offset) )  ) {
					offset++;
					continue;
				}
				int spaceToWrapAt = checkLastIndexOf(str,delimiterList, wrapLength + offset);

				if (spaceToWrapAt >= offset) {
					// normal case
					wrappedLine.append(str.substring(offset, spaceToWrapAt+1));
					wrappedLine.append(newLineStr);
					offset = spaceToWrapAt+1;
					
				} else {
					// really long word or URL
					if (wrapLongWords) {
						// wrap really long word one line at a time
						wrappedLine.append(str.substring(offset, wrapLength + offset));
						wrappedLine.append(newLineStr);
						offset += wrapLength;
					} else {
						// do not wrap really long word, just extend beyond limit
						spaceToWrapAt = checkLastIndexOf(str,delimiterList, wrapLength + offset);
						if (spaceToWrapAt >= 0) {
							wrappedLine.append(str.substring(offset, spaceToWrapAt));
							wrappedLine.append(newLineStr);
							offset = spaceToWrapAt+1;
						} else {
							wrappedLine.append(str.substring(offset));
							offset = inputLineLength;
						}
					}
				}
			}

			// Whatever is left in line is short enough to just pass through
			wrappedLine.append(str.substring(offset));

			return wrappedLine.toString();
		}
	  
	  private static int checkLastIndexOf ( String str, List<Character> delimiters, int fromIndex)
	  {
		  int indexCheck = 0;
		  int lastIndex = 0;
		  for( char character : delimiters )
		  {
			  indexCheck = str.lastIndexOf( character, fromIndex );
			  if( indexCheck > lastIndex )
			  {
				  lastIndex = indexCheck;
			  }
			  
		  }
		  
		  return lastIndex;
	  }
	  
	  
}
